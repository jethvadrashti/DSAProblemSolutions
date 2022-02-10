package DSALevel1.RecursionAndBacktracking.IntrodutionToRecursion;
//TC = O(n)
//SC = O(1)
import java.util.Scanner;

public class PrintIncrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printIncrease(n);
	}
	public static void printIncrease(int n)
	{
		if(n==0)
		{
			return;
		}
		printIncrease(n-1);
		System.out.println(n);
	}
	

}
