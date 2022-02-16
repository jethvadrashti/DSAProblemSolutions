package DSALevel1.RecursionAndBacktracking.RecursionToArray;
//TC  = O(n)
//SC = O(n) if we consider recursive stack space / otherwise O(1) [Because no extra Space required]
import java.util.Scanner;

public class LastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int lastIndex = funLastIndex(arr,n-1,x);
        System.out.println(lastIndex);
	}
	public static int funLastIndex(int[] arr,int idx,int x)
	{
		if(idx==0)
		{
			return -1;
		}
		if(arr[idx]==x)
		{
			return idx;
		}
		else
		{
			int res = funLastIndex(arr,idx-1,x);
			return res;
		}
	}
}
