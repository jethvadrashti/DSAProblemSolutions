package DSALevel1.BasicsOfProgramming.FunctionsAndArrays;
//TC = O(logn)
//SC = O(1)
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int d = sc.nextInt();
		int l = 0;
		int h = a.length-1;
		while(l<=h) {
			int mid = l+h>>1; //Right shift operator(>>) is used to divide the number by 2,which perform faster than the division operator(/).
			if(d>a[mid])
			{
				l = mid +1;
			}
			else if(d<a[mid])
			{
				h = mid -1;
			}
			else
			{
				System.out.println(mid);
				return;
			}
		}
		System.out.println(-1);
	}

}
