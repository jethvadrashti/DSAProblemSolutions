package DSALevel1.BasicsOfProgramming.FunctionsAndArrays;
//TC = O(log10n1 * log10n2)
//SC = O(1)
import java.util.Scanner;

public class AnybaseMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	    int b = scn.nextInt();
	    int n1 = scn.nextInt();
	    int n2 = scn.nextInt();

	    int d = getProduct(b, n1, n2);
	    System.out.println(d);
	}
	 public static int getProduct(int b, int n1, int n2){
	     // write your code here
	     int p = 1;
	     int ansAdd = 0;
	     while(n2!=0)
	     {
	         int d2 = n2 % 10;
	         int multiplier = multiply(n1,d2,b);
	         ansAdd = addition(ansAdd,multiplier*p,b);
	         p = p * 10;
	         n2/=10;
	     }
	     return ansAdd;

	 }
	 public static int multiply(int n1,int d2,int b)
	 {
	     int c = 0;
	     int d = 0;
	     int ans = 0;
	     int p = 1;
	     while(n1!=0 || c>0)
	     {
	         int d1 = n1 % 10;
	         d = (d1 * d2) + c;
	         c = d / b;
	         d = d % b;
	         ans += d * p;
	         p = p * 10;
	         n1/=10;
	     }
	     return ans;
	 }
	 public static int addition(int ansAdd,int ans,int b)
	 {
	     int c = 0;
	     int p = 1;
	     int result = 0;
	     while(ansAdd>0 || ans>0 || c>0)
	     {
	         int d1 = ansAdd % 10;
	         int d2 = ans % 10;
	         int d = d1+d2+c;
	         c = d /b;
	         d = d% b;
	         result += d * p;
	         p = p * 10;
	         ans /= 10;
	         ansAdd /=10;
	     }
	     return result;
	 }

}
