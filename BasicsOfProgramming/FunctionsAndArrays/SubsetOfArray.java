package DSALevel1.BasicsOfProgramming.FunctionsAndArrays;
//TC = O(n * (2^n))
//SC = O(n)
import java.util.Scanner;

public class SubsetOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int limit = (int)Math.pow(2,a.length);
		for(int i=0;i<limit;i++)
		{
			String str = "";
			int temp = i;
			for(int j=a.length-1;j>=0;j--)
			{
				int rem = temp%2;
				temp/=2;
				if(rem==0)
				{
					str = "-\t" + str;
				}
				else
				{
					str = a[j] + "\t" + str;
				}
			}
			System.out.println(str);
		}
	}

}
