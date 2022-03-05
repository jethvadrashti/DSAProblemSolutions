package DSALevel1.TimeAndSpaceComplexity;
//Best,Average,Worst Case all =>TC = O(b*n)    b = total digits of max element in array  n = total no of element in input array
//SC = O(b+n)    b = frequency array space  n = total no of element in input array

/*
 Application Of Radix Sort => Sort Dates
 */
import java.util.Scanner;

public class RadixSort {

	public static void radixSort(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		for(int val : arr)
		{
			if(val>max)
			{
				max = val;
			}
		}
		int exp = 1;
		while(exp<=max)
		{
			countSort(arr,exp);
			exp = exp * 10;
		}
	}
	public static void countSort(int[] arr,int exp)
	{
		int[] fre = new int[10];
		for(int i=0;i<arr.length;i++)
		{
			fre[arr[i]] += 1;
		}
		for(int i =1;i<fre.length;i++)
		{
			fre[i] = fre[i] + fre[i-1];
		}
		int[] ans = new int[arr.length];
		for(int i=arr.length-1;i>=0;i--)
		{
			int pos = fre[arr[i]/exp % 10];
			ans[pos-1] = arr[i];
			fre[arr[i]/exp % 10]--;
		}
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = ans[i];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		radixSort(arr);
		print(arr);
	}
	public static void print(int[] arr)
	{
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}

}
