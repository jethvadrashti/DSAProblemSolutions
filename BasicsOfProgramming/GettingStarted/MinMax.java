package DSALevel1.BasicsOfProgramming.GettingStarted;
//TC = O(nlogn)
//SC = O(1)
import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int[] A = new int[n];
		    for(int i=0;i<n;i++)
		    {
		      A[i] = sc.nextInt();
		    }
		    Arrays.sort(A);
		    System.out.print(A[n-2]+" "+A[1]);
	}
}
