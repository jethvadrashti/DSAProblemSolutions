package DSALevel1.RecursionAndBacktracking.RecursionBacktracking;
//TC = O(2^n)
//SC = O(1)
import java.util.Scanner;

public class TargetSumSubset {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int tar = sc.nextInt();
		printTargetSumSubset(arr,0,"",0,tar);
	}
	public static void printTargetSumSubset(int[] arr,int idx,String set,int sos,int tar)
	{
		if(sos>tar)
		{
			return;
		}
		if(idx==arr.length)
		{
			if(sos==tar)
			{
				System.out.println(set+".");
			}
			return;
		}
		printTargetSumSubset(arr,idx+1,set+arr[idx]+",",sos+arr[idx],tar);
		printTargetSumSubset(arr,idx+1,set,sos,tar);
	}
}
