package DSALevel1.TimeAndSpaceComplexity;
/*
https://www.codingninjas.com/blog/2021/08/30/understanding-quicksort/

Best case => TC = O(nlogn) SC = O(1)
Average Case => TC = O(nlogn) SC = O(1)
Worst Case => TC = O(n^2)  SC = O(1)
 */
import java.util.Scanner;

public class QuickSelect {

	public static int quickSelect(int[] a,int lo,int hi,int k)
	{
		int ans = 0;
		int pivot = a[hi];
		int pi = partitionOfArray(a,pivot);
		for(int i=0;i<a.length;i++)
		{
			if(a[pi]>a[i])
			{
				
			}
		}
		return ans;
	}
	public static int partitionOfArray(int[] a,int pivot)
	{
		int i=0,j=0,ans=0;
		
		while(i<a.length)
		{
			if(a[i]>pivot)
			{
				i++;
			}
			else if(a[i]<pivot)
			{
				swap(a,i,j);
				i++;
				j++;
			}
			else
			{
				ans = i;
			}
		}
		return ans;
	}
	public static void swap(int[] a,int i,int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
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
		int k = sc.nextInt();
		int ans = quickSelect(a,0,a.length-1,k);
	}

}
