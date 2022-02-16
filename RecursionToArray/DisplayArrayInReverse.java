package DSALevel1.RecursionAndBacktracking.RecursionToArray;
//TC  = O(n)
//SC = O(n) if we consider recursive stack space / otherwise O(1)
import java.util.Scanner;

public class DisplayArrayInReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        displayArrayreverse(arr,n-1);
	}
	public static void displayArrayreverse(int[] arr,int idx)
	{
		if(idx==-1)
		{
			return;
		}
		System.out.println(arr[idx]);
		displayArrayreverse(arr,idx-1);
	}
}
