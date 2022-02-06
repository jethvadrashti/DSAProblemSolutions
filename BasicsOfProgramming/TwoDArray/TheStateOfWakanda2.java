package DSALevel1.BasicsOfProgramming.TwoDArray;
//TC = O(n^2)
//SC = O(1)
import java.util.Scanner;

public class TheStateOfWakanda2 {
	  public static void main(String[] args) throws Exception {
	        // write your code here
	         Scanner sc = new Scanner(System.in);
	        int row = sc.nextInt();
	        int[][] a = new int[row][row];
	        for(int i=0;i<row;i++)
	        {
	            for(int j=0;j<row;j++)
	            {
	                a[i][j] = sc.nextInt();
	            }
	        }

	        for(int k=0;k<row;k++)
	        {
	            int i=0;
	            while(i<row-k)
	            {
	                System.out.println(a[i][i+k]);
	                i++;
	            }
	        }
	        
	    }

}
