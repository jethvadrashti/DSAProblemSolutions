package DSALevel1.BasicsOfProgramming.FunctionsAndArrays;
//TC = O(log10n + log10n) = O(log10n)
//SC = O(1)
import java.util.Scanner;

public class AnybaseToAnybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int sourceBase = scn.nextInt();
	     int  destBase= scn.nextInt();
	     anybaseToAnybaseConversion(destBase,sourceBase,n);
	}
	public static int anybaseToDecimal(int sourceBase,int n)
	   {
	     int ans = 0;
	     int p = 1;
	     while(n!=0)
	     {
	       int rem = n % 10;
	       ans += rem * p;
	       p = p * sourceBase;
	       n/=10;
	     }
	     return ans;
	   }
	   public static void anybaseToAnybaseConversion(int destBase,int sourceBase,int n)
	   {
	     int decimal = anybaseToDecimal(sourceBase,n);
	     int p = 1;
	     int ansMain = 0;
	     while(decimal!=0)
	     {
	       int rem = decimal % destBase;
	       ansMain += rem * p;
	       p = p * 10;
	       decimal /= destBase;
	     }
	     System.out.println(ansMain);
	   }
}
