package DSALevel1.BasicsOfProgramming.GettingStarted;
//TC = O(log10n)
//SC = O(1)
import java.util.Scanner;

public class InverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
		  int i = 1;
		  int ans = 0;
		  while(n!=0)
		  {
		      int rem = n % 10;
		      ans += i * (int)Math.pow(10,rem-1);
		      n = n /10;
		      i++;
		  }
		  System.out.println(ans);
	}

}
