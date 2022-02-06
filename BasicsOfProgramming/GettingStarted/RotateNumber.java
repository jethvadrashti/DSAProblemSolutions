package DSALevel1.BasicsOfProgramming.GettingStarted;
//TC = O(count*log10n) where count = total number of digits
//SC = O(1)
import java.util.Scanner;

public class RotateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     int k = sc.nextInt();
	     int temp = n;
	     int count = 0;
	     while(temp!=0)
	     {
	         temp /= 10;
	         count++;
	     }
	     k = k % count;
	     if(k<0)
	     {
	         k = k + count;
	     }
	     int multi = 1;
	     int div = 1;
	     int i = 1;
	     while(i<=count)
	     {
	         if(i<=k)
	         {
	             div *= 10;
	         }
	         else
	         {
	             multi *= 10;
	         }
	         i++;
	     }
	     int rem = n % div;
	     int q = n / div;
	     int ans = rem * multi + q;
	     System.out.println(ans);

	    }
	

}
