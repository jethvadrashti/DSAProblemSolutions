package DSALevel1.BasicsOfProgramming.GettingStarted;
//TC = O(t* squareroot(n))
//SC = O(1)
import java.util.Scanner;

public class IsNumberPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scn = new Scanner(System.in);
		  
	       // write ur code here
	       int t = scn.nextInt();
	       while(t-->0)
	       {
	           int n = scn.nextInt();
	           int div = 2;
	           while(div*div<=n)
	           {
	               if(n%div==0)
	               {
	                   break;
	               }
	               div++;
	           }
	           if(div*div>n)
	           {
	               System.out.println("prime");
	           }
	           else
	           {
	               System.out.println("not prime");
	           }
	       }

	}

}
