package DSALevel1.BasicsOfProgramming.GettingStarted;

import java.util.Scanner;
//TC = O(count*lon10n) where count = total digits of number
//SC = O(1)
public class PrintDigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int temp = n;
	      int count =0;
	      while(temp!=0)
	      {
	          temp /= 10;
	          count++;
	      } 
	      int div = (int)Math.pow(10,count-1);
	      while(count!=0)
	      {
	          int rem = n / div;
	          System.out.println(rem);
	          n = n % div;
	          div /=10;
	          count--;
	      }
	}

}
