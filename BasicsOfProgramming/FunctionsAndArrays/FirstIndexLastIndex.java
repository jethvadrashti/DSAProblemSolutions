package DSALevel1.BasicsOfProgramming.FunctionsAndArrays;

import java.util.Scanner;

public class FirstIndexLastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] a = new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i] = sc.nextInt();
	    }
	    int d  = sc.nextInt();
	    int l=0;
	    int h = a.length-1;
	    int firstIndex = 0;
	    int lastIndex = 0;
	    while(l<=h)
	    {
	        int mid = l+h>>1;
	        
	            if(d>a[mid])
	            {
	                l = mid +1;
	            }
	            else if(d<a[mid])
	            {
	                h = mid -1;
	            }
	            else{
	                lastIndex = mid;
	                l = mid +1;
	            }
	    }
	     l=0;
	     h = a.length-1;
	     firstIndex = 0;
	     while(l<=h)
	    {
	        int mid = l+h>>1;
	       
	            if(d>a[mid])
	            {
	                l = mid +1;
	            }
	            else if(d<a[mid])
	            {
	                h = mid -1;
	            }
	            else{
	                 firstIndex = mid;
	                h = mid -1;
	            }
	        
	    }
	   
	    if(firstIndex==0 && lastIndex==0)
	    {
	       
	            System.out.println(-1);
	            return;
	    }
	    else{
	            System.out.println(firstIndex);
	           System.out.println(lastIndex);
	    }
	}

}
