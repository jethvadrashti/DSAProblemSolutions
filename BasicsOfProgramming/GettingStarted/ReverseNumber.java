package DSALevel1.BasicsOfProgramming.GettingStarted;
import java.util.*;
//TC = O(log10n)
//SC = O(1)
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     while(n!=0)
	     {
	         int rem = n % 10;
	         System.out.println(rem);
	         n /=10;
	     }
	}

}
