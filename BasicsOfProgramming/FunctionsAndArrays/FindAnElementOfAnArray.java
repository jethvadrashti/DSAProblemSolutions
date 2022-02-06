package DSALevel1.BasicsOfProgramming.FunctionsAndArrays;
//TC = O(n)
//SC = O(1)
import java.util.Scanner;

public class FindAnElementOfAnArray {

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
		    int i=0;
		    for(i=0;i<n;i++)
		    {
		        if(a[i]==d)
		        {
		            System.out.println(i);
		            return;
		        }
		    }
		    if(i>=n)
		    {
		        System.out.println(-1);
		    }

	}

}
