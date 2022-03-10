package DSALevel1.StackAndQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class StockSpan {
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

	    int[] span = solve(a);
	    display(span);
	 }

	 public static int[] solve(int[] arr){
	   // solve
	   int[] ans = new int[arr.length];
	   Stack<Integer> st = new Stack<>();
	    st.push(0);
	    ans[0] = 1;
	    for(int i=1;i<arr.length;i++)
	    {
	      int span = 0;
	      while(st.size()!=0 && arr[i]>arr[st.peek()])
	      {
	        st.pop();
	      }
	      if(st.size()==0)
	      {
	        span = i + 1;
	      }
	      else
	      {
	        span = i - st.peek();
	      }
	      ans[i] = span;
	      st.push(i);
	    }
	   return ans;
	 }

}
