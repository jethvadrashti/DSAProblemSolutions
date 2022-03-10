package DSALevel1.StackAndQueue;
//TC = O(n)
//SC = O(n)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class NextGreaterElementToRight {
	public static void display(int[] a){
	    StringBuilder sb = new StringBuilder();

	    for(int val: a){
	      sb.append(val + "\n");
	    }
	    System.out.println(sb);
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

	 public static int[] solve(int[] arr){
	   int[] ans = new int[arr.length];
	   Stack<Integer> st = new Stack<>();
	   st.push(arr.length-1);
	   ans[arr.length-1] = -1;
	    for(int i=arr.length-2;i>=0;i--)
	    {
	    	  while(st.size()!=0 && arr[i]>arr[st.peek()])
		      {
		           st.pop();
		      }
	      if(st.size()==0)
	      {
	        ans[i] = -1;
	      }
	      else
	      {
	        ans[i] = arr[st.peek()];
	      }
	      st.push(i);
	    }
	   return ans;
	 }

}//2 5 9 3 1 12 6 8 7
