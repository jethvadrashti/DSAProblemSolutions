package DSALevel1.RecursionAndBacktracking.IntrodutionToRecursion;

import java.util.Scanner;
//TC = O(n)
//SC = O(1)
public class PrintDecreasing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printDecrease(n);
	}
	public static void printDecrease(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		printDecrease(n-1);
	}
}
