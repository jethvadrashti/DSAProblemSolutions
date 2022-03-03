package DSALevel1.RecursionAndBacktracking.IntrodutionToRecursion;
//TC = O(n)
//SC = O(1)
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = factorial(n);
		System.out.println(result);
	}
	public static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		int fact = 1;
		fact = n * factorial(n-1);
		return fact;
	}

}
