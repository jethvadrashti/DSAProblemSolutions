package DSALevel1.TimeAndSpaceComplexity;
//TC = O(n+k) k = range n = no of Element in Arrays --> True for Average,best and worst all cases
//SC = O(n+k) --> True for Average,best and worst all cases
/*
 When we use this algorithm for sort arrays?
 when the no of elements in arrays are higher ans the range value is less at that time count sort algorithm is the best for sorting array.
 */
import java.util.Scanner;

public class CountSort {

	public static void countSort(int[] a)
	{
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		int range  = max - min + 1;
		int[] ans = new int[range];
		for(int i=0;i<a.length;i++)
		{
			int idx = a[i] - min;
			int temp = 1;
			ans[idx] += temp;
		}
		int prefix = ans[0];
		for(int i=1;i<ans.length;i++)
		{
			ans[i] = ans[i] + prefix;
			prefix = ans[i];
		}
		int[] ansMain = new int[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
			int res = a[i] - min;
			ansMain[ans[res]-1]  = a[i];
			ans[res] = ans[res] - 1;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(ansMain[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		countSort(a);
	}

}
