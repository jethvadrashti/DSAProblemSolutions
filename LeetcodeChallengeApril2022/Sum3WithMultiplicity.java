package LeetcodeChallengeApril2022;
//TC = O(n^2)
//SC = O(100)
import java.util.Scanner;

public class Sum3WithMultiplicity {

	 
	public static int sumMultiplication(int[] a,int target)
	{
		int mod = 100000009;
		 long result = 0;
		
	
		for(int i=0;i<a.length;i++)
		{
			int[] count = new int[101];
			for(int j=i+1;j<a.length;j++)
			{
				int k = target - a[i] - a[j];
				if(k>=0 && k<=100 && count[k]>0)
				{
					result += count[k];
					result %= mod;
				}
				count[a[j]]++;
			}
		}
		return (int)result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int ans = sumMultiplication(a,target);
		System.out.println(ans);
	}

}
/*
 5
[1,1,2,2,2,2]
 */
