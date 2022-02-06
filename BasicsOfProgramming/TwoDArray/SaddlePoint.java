package DSALevel1.BasicsOfProgramming.TwoDArray;

import java.util.Scanner;
//TC = O(n*n)
//SC = O(1)
public class SaddlePoint {

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
	        for(int i=0;i<row;i++)
	        {
	            int svj = 0;
	            for(int j=1;j<a[0].length;j++)
	            {
	                if(a[i][svj]>a[i][j])
	                {
	                    svj = j;
	                }
	            }
	            boolean flag = true;
	            for(int k=0;k<a[0].length;k++)
	            {
	                if(a[i][svj]<a[k][svj])
	                {
	                    flag = false;
	                }
	            }
	            if(flag)
	            {
	                System.out.println(a[i][svj]);
	                return;
	            }
	        }
	        System.out.println("Invalid input");

	}

}
