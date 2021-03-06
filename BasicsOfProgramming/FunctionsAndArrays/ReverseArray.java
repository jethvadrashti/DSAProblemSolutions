package DSALevel1.BasicsOfProgramming.FunctionsAndArrays;
//TC = O(n)
//SC = O(1)
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseArray {

	public static void display(int[] a){
	    StringBuilder sb = new StringBuilder();

	    for(int val: a){
	      sb.append(val + " ");
	    }
	    System.out.println(sb);
	  }

	  public static void reverse(int[] a){
	    // write your code here
	    int l = 0,r=a.length-1;
	    while(l<r)
	    {
	      int temp = a[l];
	      a[l] = a[r];
	      a[r] = temp;
	      l++;
	      r--;
	    }
	  }

	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }

	    reverse(a);
	    display(a);
	 }

}
