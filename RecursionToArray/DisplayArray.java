package DSALevel1.RecursionAndBacktracking.RecursionToArray;
//TC  = O(n)
//SC = O(n) if we consider recursive stack space / otherwise O(1) [Because no extra Space required]
import java.util.Scanner;

public class DisplayArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        displayArray(arr,0);
	}
	public static void displayArray(int[] arr,int idx)
	{
		if(idx==arr.length)
		{
			return;
		}
		System.out.println(arr[idx]);
		displayArray(arr,idx+1);
	}

}
