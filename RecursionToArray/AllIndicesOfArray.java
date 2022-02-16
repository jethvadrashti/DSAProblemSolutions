package DSALevel1.RecursionAndBacktracking.RecursionToArray;
//TC  = O(n)
//SC = O(n) if we consider recursive stack space and also index array space.
import java.util.Scanner;

public class AllIndicesOfArray {

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
        int[] ans = allIndices(arr,0,x,0);
        for(int res : ans)
        {
        	System.out.println(res);
        }
	}
	public static int[] allIndices(int[] arr,int idx,int x,int fsaf)
	{
		if(idx==arr.length)
		{
			return new int[fsaf];
		}
		if(arr[idx]==x)
		{
			int[] result = allIndices(arr,idx+1,x,fsaf+1);
			result[fsaf] = idx;
			return result;
		}
		else
		{
			int[] result = allIndices(arr,idx+1,x,fsaf);
			return result;
		}
	}
}
