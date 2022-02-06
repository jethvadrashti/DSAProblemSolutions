package DSALevel1.BasicsOfProgramming.FunctionsAndArrays;
//TC = O(n)
//SC = O(1)
import java.util.Scanner;

public class PermutationAndCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int permutation = permutationFind(n,r);
		int combination = combinationFind(n,r);
		System.out.println(permutation);
		System.out.println(combination);
	}
	public  static int permutationFind(int n,int r)
	{
		int numerator = factorial(n);
		int denominator = factorial(n-r);
		return (int)numerator/denominator;
	}

	public static int combinationFind(int n,int r) {
		int numerator = factorial(n);
		int denominator = factorial(n-r);
		int rfact = factorial(r);
		return (int)numerator/(denominator * rfact);
	}
	public static int factorial(int x)
	{
		int fact = 1;
		while(x!=1)
		{
			fact *= x;
			x--;
		}
		return fact;
	}
}
