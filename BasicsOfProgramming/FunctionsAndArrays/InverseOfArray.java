package DSALevel1.BasicsOfProgramming.FunctionsAndArrays;
//TC = O(n)
//SC = O(n)
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InverseOfArray {

	public static void display(int[] a){
	    StringBuilder sb = new StringBuilder();

	    for(int val: a){
	      sb.append(val + "\n");
	    }
	    System.out.println(sb);
	  }

	  public static int[] inverse(int[] a){
	    // write your code here
	    int[] inva = new int[a.length];
	    int idx = a.length-1;
	    while(idx>=0)
	    {
	    	inva[a[idx]] = idx;
	    	idx--;
	    }
	    return inva;
	  }

	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }

	    int[] inv = inverse(a);
	    display(inv);
	 }

}
