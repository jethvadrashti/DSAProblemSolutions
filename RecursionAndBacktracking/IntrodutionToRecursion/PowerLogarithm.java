package DSALevel1.RecursionAndBacktracking.IntrodutionToRecursion;
//TC = O(lognbase2)
//SC = O(1)
import java.util.Scanner;

public class PowerLogarithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int result = powerLogrithm(x,n);
		System.out.println(result);
	}
	public static int powerLogrithm(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
		int xn = powerLogrithm(x,n/2) * powerLogrithm(x,n/2);
		if(n%2==1)
		{
			return x * xn;
		}
		return xn;
	}
}
