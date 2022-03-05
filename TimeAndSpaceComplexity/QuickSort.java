package DSALevel1.TimeAndSpaceComplexity;
/*
https://www.codingninjas.com/blog/2021/08/30/understanding-quicksort/

Best case => TC = O(nlogn) SC = O(1)
Average Case => TC = O(nlogn) SC = O(1)
Worst Case => TC = O(n^2)  SC = O(logn)
 */
import java.util.Scanner;

public class QuickSort {

	public static void quickSort(int[] a,int lo,int hi)
	{
		if(lo>hi)
		{
			return;
		}
		int pivot = a[hi];
		int pi = partitionOfArray(a,pivot);
		quickSort(a,0,pi-1);
		quickSort(a,pi+1,hi);
	}
	public static int partitionOfArray(int[] a,int pivot)
	{
		int ans =0;
		int i =0,j=0;
		while(i<a.length)
		{
			if(a[i]<pivot)
			{
				i++;
			}
			else if(a[i]>pivot)
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
	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		quickSort(a,0,a.length-1);
		print(a);
	}
}
