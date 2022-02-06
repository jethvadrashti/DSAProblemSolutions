package DSALevel1.BasicsOfProgramming.FunctionsAndArrays;
//TC = O(log10(max(n1,n2)+1))
//SC = O(1)
import java.util.Scanner;

public class AnyBaseAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	      int b = scn.nextInt();
	      int n1 = scn.nextInt();
	      int n2 = scn.nextInt();
	  
	      int d = getSum(b, n1, n2);
	      System.out.println(d);
	}
	public static int getSum(int b, int n1, int n2){
	       // write ur code here
	       int ans =0;
	       int c =0;
	       int p = 1;
	       while(n1!=0 || n2!=0 || c!=0)
	       {
	           int d1 = n1 % 10;
	           int d2 = n2 % 10;
	           int d = d1 + d2 + c;
	           c = d / b;
	           d = d % b;
	           ans += d * p;
	           n1/=10;
	           n2/=10;
	           p = p * 10;
	       }
	       return ans;
	   }
}
