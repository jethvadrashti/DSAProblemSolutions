package DSALevel1.BasicsOfProgramming.FunctionsAndArrays;
//TC = O(logn)
//SC = O(1)
import java.util.Scanner;

public class BrokenEconomy {

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
	    int ceil = 0;
	    int floor =0;
	    while(l<=h)
	    {
	        int mid = l+h>>1;
	        if(d>a[mid])
	        {
	            l = mid +1;
	            floor = mid;
	        }
	        else if(d<a[mid])
	        {
	            h = mid -1;
	            ceil = mid;
	        }
	        else{
	            System.out.println(a[mid]);
	            return;
	        }
	    }
	    System.out.println(a[ceil]);
	    System.out.println(a[floor]);
	}

}
