package DSALevel1.StackAndQueue;
//TC = O(n)
//SC = O(n)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class NextGreaterLeft {

	public static void display(int[] a){
	    StringBuilder sb = new StringBuilder();

	    for(int val: a){
	      sb.append(val + " ");
	    }
	    System.out.println(sb);
	  }
	public static int[] solve(int[] a)
	{
		int[] ans = new int[a.length];
		Stack<Integer> st = new Stack<>();
		st.push(0);
		ans[0] = -1;
		for(int i=1;i<a.length;i++)
		{
			while(st.size()>0 && a[i]>=a[st.peek()])
			{
				st.pop();
			}
			if(st.size()==0)
			{
				ans[i] = -1;
			}
			else
			{
				ans[i] = a[st.peek()];
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

	    int[] nge = solve(a);
	    display(nge);
	 }
	//INPUTS => 2 5 9 3 1 12 6 8 7
	//OUTPUTS => -1 -1 -1 9 3 -1 12 12 8 
}
