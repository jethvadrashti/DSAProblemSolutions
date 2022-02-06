package DSALevel1.BasicsOfProgramming.TwoDArray;
//TC = O(row*column) = O(n^2)
//SC = O(1)
import java.util.Scanner;

public class TheStateOfWakanda1 {

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
	    for(int j=0;j<column;j++)
		{
			if(j%2==0)
			{
				for(int i=0;i<row;i++)
				{
					System.out.println(a[i][j]);
				}
			}
			else
			{
				for(int i=row-1;i>=0;i--)
				{
					System.out.println(a[i][j]);
				}
			}
		}
	    
	}

}
