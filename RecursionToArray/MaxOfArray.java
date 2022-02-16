package DSALevel1.RecursionAndBacktracking.RecursionToArray;
//TC  = O(n)
//SC = O(n) if we consider recursive stack space / otherwise O(1)
import java.util.Scanner;

public class MaxOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = maxOfArray(arr,0);
        System.out.println(max);
	}
	public static int maxOfArray(int[] arr,int idx)
	{
		if(idx==arr.length)
		{
			return 0;
		}
		int res = maxOfArray(arr,idx+1);
		if(res>arr[idx])
		{
			return res;
		}
		else
		{
			return arr[idx];
		}
	}
}
