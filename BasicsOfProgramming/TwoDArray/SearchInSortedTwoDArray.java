package DSALevel1.BasicsOfProgramming.TwoDArray;
//TC = O(row+column) = O(n+n) = O(n)
//SC = O(1)
import java.util.Scanner;

public class SearchInSortedTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	        int x = sc.nextInt();
	        int i=0,j=a[0].length-1;
	        while(i<=a.length-1 && j>=0)
	        {
	            if(a[i][j]==x)
	            {
	                System.out.println(i); 
	                System.out.println(j); 
	                return;
	            }
	            else if(x>a[i][j])
	            {
	                i++;
	            }
	            else
	            {
	                j--;
	            }
	        }
	      System.out.println("Not Found");
	}

}
