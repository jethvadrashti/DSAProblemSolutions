package DSALevel1.BasicsOfProgramming.GettingStarted;
//TC = O(n)
//SC = O(1)
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int a = 0;
	      int b = 1;
	      int i = 1;
	      while(i<=n)
	      {
	          System.out.println(a);
	          int c = a + b;
	          a = b;
	          b = c;
	          i++;
	      }
	}

}
