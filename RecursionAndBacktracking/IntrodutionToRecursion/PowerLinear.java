package DSALevel1.RecursionAndBacktracking.IntrodutionToRecursion;

import java.util.Scanner;
//TC = O(n)
//SC = O(1)
public class PowerLinear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int result = powerLinear(x,n);
		System.out.println(result);
	}
	public static int powerLinear(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
		int ans = 1;
		ans = x * powerLinear(x,n-1);
		return ans;
	}
}
