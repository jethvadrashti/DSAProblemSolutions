package DSALevel1.RecursionAndBacktracking.IntrodutionToRecursion;
//TC = O(n)
//SC = O(1)
import java.util.Scanner;

public class PrintIncreaseDecrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printIncreaseDecrease(n);
	}
	public static void printIncreaseDecrease(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		printIncreaseDecrease(n-1);
		System.out.println(n);
	}
	

}
