package DSALevel1.BasicsOfProgramming.FunctionsAndArrays;
//TC = O(max(n1,n2))
//SC = O(max(n1,n2))
import java.util.Scanner;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n1 = sc.nextInt();
	    int[] a1 = new int[n1];
	    for(int i=0;i<n1;i++)
	    {
	        a1[i] = sc.nextInt();
	    }
	    int n2 = sc.nextInt();
	    int[] a2 = new int[n2];
	    for(int i=0;i<n2;i++)
	    {
	        a2[i] = sc.nextInt();
	    }
	    int[] ans = new int[n1>n2?n1:n2];
	    int i = n1 - 1;
	    int j = n2 - 1;
	    int k = ans.length - 1;
	    int c = 0;
	    int d =0;
	    while(k>=0)
	    {
	       d = c;
	       if(i>=0)
	       {
	    	   d+= a1[i];
	       }
	       if(j>=0)
	       {
	    	   d+= a2[j];
	       }
	        c = d / 10;
	        d = d % 10;
	        ans[k] = d;
	        k--;
	        i--;
	        j--;
	    }
	    if(c!=0)
	    {
	    	System.out.println(c);
	    }
	    for(i=0;i<ans.length;i++)
	    {
	        System.out.println(ans[i]);
	    }
	}

}
