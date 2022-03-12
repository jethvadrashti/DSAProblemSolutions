package DSALevel1.StackAndQueue;
//TC = O(n)
//SC = O(n)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class SlidingWindowMaximum {
	public static int[] nextGreaterElement(int[] a)
	{
		 int[] ans = new int[a.length];
		   Stack<Integer> st = new Stack<>();
		   st.push(a.length-1);
		   ans[a.length-1] = a.length;
		    for(int i=a.length-2;i>=0;i--)
		    {
		    	  while(st.size()>0 && a[i]>=a[st.peek()])
			      {
			           st.pop();
			      }
		      if(st.size()==0)
		      {
		        ans[i] = a.length;
		      }
		      else
		      {
		        ans[i] = st.peek();
		      }
		      st.push(i);
		    }
		   return ans;
	}
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }
	    int k = Integer.parseInt(br.readLine());

	    // code
	    int[] nge = nextGreaterElement(a);
	    int j = 0;
	    for(int i=0;i<=a.length-k;i++)
	    {
	    	if(j<i)
	    	{
	    		j = i;
	    	}
	    	while(nge[j]<i+k)
	    	{
	    		j = nge[j];
	    	}
	    	System.out.println(a[j]);
	    }
	 }//2 9 3 8 1 7 12 6 14 4 32 0 7 19 8 12 6
}
