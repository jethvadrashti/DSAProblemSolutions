package DSALevel1.BasicsOfProgramming.FunctionsAndArrays;
//TC = O(LogBn)
//SC = O(1)
import java.util.Scanner;

public class DecimalTOAnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int b = scn.nextInt();
	      int dn = getValueInBase(n, b);
	      System.out.println(dn);
	}
	public static int getValueInBase(int n, int b){
	       // write code here
	       int temp = n;
	       int p = 1;
	       int ans =0;
	       while(temp!=0)
	       {
	           int rem = temp % b;
	            ans += rem * p;
	           p = p * 10;
	           temp /= b;
	       }
	       return ans;
	   }

}
