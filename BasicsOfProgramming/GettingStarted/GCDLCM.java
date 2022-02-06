package DSALevel1.BasicsOfProgramming.GettingStarted;
//TC = O(min(num1,num2))
//SC = O(1)
import java.util.Scanner;

public class GCDLCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      int num1 = sc.nextInt();
	      int num2 = sc.nextInt();
	      int gcd = gcdFind(num1,num2);
	      int lcm = lcmFind(num1,num2,gcd);
	      System.out.println(gcd);
	      System.out.println(lcm);
	     }
	     public static int gcdFind(int num1,int num2)
	     {
	        while(num1 % num2 !=0)
	        {
	          int rem = num1 % num2;
	          num1 = num2;
	          num2 = rem;
	        }
	        return num2;
	     }
	     public static int lcmFind(int num1,int num2,int gcd)
	     {
	       int ans = (num1 * num2)/gcd;
	       return ans;
	     }
	

}
