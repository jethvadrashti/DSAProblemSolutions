package DSALevel1.BasicsOfProgramming.FunctionsAndArrays;
//TC = O(max(n1,n2))
//SC = O(max(n1,n2))
import java.util.Scanner;

public class DifferenceOfTwoArrays {

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
		    int i = n1 -1;
		    int j = n2 -1;
		    int k = ans.length -1;
		    int d = 0,c=0;
		    while(k>=0)
		    {

		        int av1 = i>=0?a1[i]:0;
		        if(a2[j]+c>=av1)
		        {
		            d = (a2[j]+c) - av1;
		            c = 0;
		        }
		        else
		        {
		            d = (a2[j]+10+c) - av1;
		            c = -1;
		        }
		        ans[k] = d;
		        i--;
		        j--;
		        k--;
		    }
		    i = 0;
		   while(ans[i]==0)
		   {
		       i++;
		   }
		   while(i<k)
		   {
		       System.out.println(ans[i]);
		       i++;
		   }
	}

}
