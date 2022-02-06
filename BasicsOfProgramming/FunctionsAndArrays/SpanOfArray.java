package DSALevel1.BasicsOfProgramming.FunctionsAndArrays;

import java.util.Scanner;
//TC = O(n)
//SC = O(1)
public class SpanOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] a = new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i] = sc.nextInt();
	    }
	    int max = a[0];
	    for(int i=0;i<n;i++)
	    {
	        if(a[i]>max)
	        {
	            max = a[i];
	        }
	    }
	    int min = a[0];
	    for(int i=0;i<n;i++)
	    {
	        if(a[i]<min)
	        {
	            min = a[i];
	        }
	    }
	    System.out.println(max-min);
	}

}
