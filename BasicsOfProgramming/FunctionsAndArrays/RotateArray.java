package DSALevel1.BasicsOfProgramming.FunctionsAndArrays;
//TC = O(n)
//SC = O(1)
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RotateArray {

	public static void display(int[] a){
	    StringBuilder sb = new StringBuilder();

	    for(int val: a){
	      sb.append(val + " ");
	    }
	    System.out.println(sb);
	  }

	  public static void rotate(int[] a, int k){
	    // write your code here
	    int length = a.length;
	    k = k % length;
	    if(k<0)
	    {
	      k = k + length;
	    }
	    reverseArray(0,a.length-1-k,a);
	    reverseArray(a.length-k,a.length-1,a);
	    reverseArray(0,a.length-1,a);
	  }

	  public static void reverseArray(int start,int end,int[] a)
	  {
	    while(start<end)
	    {
	      int temp = a[start];
	      a[start] = a[end];
	      a[end] = temp;
	      start++;
	      end--;
	    }
	  }

	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }
	    int k = Integer.parseInt(br.readLine());

	    rotate(a, k);
	    display(a);
	 }


}
