package DSALevel1.BasicsOfProgramming.TwoDArray;

import java.util.Scanner;

//TC = O(n*m)
//SC = O(n*m)
public class TwoDArrayDemo {

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
		    for(int i=0;i<row;i++)
		    {
		        for(int j=0;j<column;j++)
		        {
		            System.out.print(a[i][j]+"\t ");
		        }
		        System.out.println();
		    }
	}

}
