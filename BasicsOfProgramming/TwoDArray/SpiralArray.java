package DSALevel1.BasicsOfProgramming.TwoDArray;
//TC = O(row*column) = O(n^2)
//SC = O(1)
import java.util.Scanner;

public class SpiralArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        int row = sc.nextInt();
	        int column = sc.nextInt();
	        int[][] a = new int[row][column];
	        for(int i=0;i<row;i++)
	        {
	            for(int j=0;j<column;j++)
	            {
	                a[i][j] = sc.nextInt();
	            }
	        }
	        int count = 0;
	        int limit = row * column;
	        int minr = 0;
	        int minc = 0;
	        int maxr = a.length-1;
	        int maxc = a[0].length-1;
	        while(count<limit)
	        {
	            //Left wall
	          if(count<limit)
	          {
	                 for(int i=minr,j=minc;i<=maxr;i++)
	                {
	                    System.out.println(a[i][j]);
	                    count++;
	                }
	            
	          }   
	            minc++;

	            //Bottom wall
	            if(count<limit)
	          {
	                for(int j=minc,i=maxr;j<=maxc;j++)
	                {
	                    System.out.println(a[i][j]);
	                    count++;
	                }
	          }
	            maxr--;

	            //Right wall
	             if(count<limit)
	          {
	           for(int i=maxr,j=maxc;i>=minr;i--)
	                {
	                    System.out.println(a[i][j]);
	                    count++;
	                }
	          }
	            maxc--;

	            //Top wall
	             if(count<limit)
	          {
	              for(int j=maxc,i=minr;j>=minc;j--)
	                {
	                    System.out.println(a[i][j]);
	                    count++;
	                }
	          }
	            minr++;
	        }
	}

}
