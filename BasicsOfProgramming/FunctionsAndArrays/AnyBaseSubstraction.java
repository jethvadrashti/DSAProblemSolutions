package DSALevel1.BasicsOfProgramming.FunctionsAndArrays;
//TC = O(log10n2)
//SC = O(1)
import java.util.Scanner;

public class AnyBaseSubstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
	      int b = scn.nextInt();
	      int n1 = scn.nextInt();
	      int n2 = scn.nextInt();
	  
	      int d = getDifference(b, n1, n2);
	      System.out.println(d);
	}
	 public static int getDifference(int b, int n1, int n2){
	       // write your code here
	       int c = 0;
	       int ans = 0;
	       int p = 1;
	       int d =0;
	       while(n2!=0)
	       {
	           int d2 = n2 % 10;
	           int d1 =  n1 % 10;
	           if(d2+c<d1)
	           {
	               d = (d2+b+c) - d1;
	              c = -1; 
	           }
	           else
	           {
	                d = (d2+c) - d1;
	               c = 0;
	           }
	           d = d % b;
	           ans += d * p;
	           p = p * 10;
	           n2 /=10;
	           n1/=10;
	       }
	       return ans;
	   }
	  
}
