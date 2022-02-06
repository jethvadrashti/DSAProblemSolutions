package DSALevel1.BasicsOfProgramming.TwoDArray;
//TC = O(row1*colunm2*row2) = O(n^3)
//SC = O(row1*column2)      = O(n^2)
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int row1 = sc.nextInt();
	    int column1 = sc.nextInt();
	    int[][] a1 = new int[row1][column1];
	    for(int i=0;i<row1;i++)
	    {
	        for(int j=0;j<column1;j++)
	        {
	            a1[i][j] = sc.nextInt();
	        }
	    }
	    int row2 = sc.nextInt();
	    int column2 = sc.nextInt();
	    int[][] a2 = new int[row2][column2];
	    for(int i=0;i<row2;i++)
	    {
	        for(int j=0;j<column2;j++)
	        {
	            a2[i][j] = sc.nextInt();
	        }
	    }
	    int ansRow  = row1;
	    int ansColumn = column2;
	    int[][] ans = new int[ansRow][ansColumn];
	     if(row2==column1)
	    {
	        for(int i=0;i<row1;i++)
	        {
	            for(int j=0;j<column2;j++)
	            {
	                for(int k=0;k<row2;k++)
	                {
	                    ans[i][j] += a1[i][k] * a2[k][j];
	                }
	            }
	        }
	        for(int i=0;i<row1;i++)
	    {
	        for(int j=0;j<column2;j++)
	        {
	            System.out.print(ans[i][j]+" ");
	        }
	        System.out.println();
	    }
	    }
	    else
	    {
	        System.out.println("Invalid input");
	    }
	}

}
