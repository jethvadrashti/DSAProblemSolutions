package DSALevel1.RecursionAndBacktracking.RecursionBacktracking;
//This code is exponential in nature, and it's time complexity will turn out to be O(n!). It is better than the brute force/naive approach which has O(n^n) time complexity.
//TC = O(n!)
//SC = O(n) if we consider space used by recursive stack.
import java.util.Scanner;

public class NQueen {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        printNQueens(chess,"",0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        
        if(row==chess.length)
        {
            System.out.println(qsf+".");
            return;
        }
        for(int col=0;col<chess.length;col++)
        {
            if(isItPlaceSafeForQueen(chess,row,col))
            {
                chess[row][col] = 1;
                printNQueens(chess,qsf+row+"-"+col+", ",row+1);
                chess[row][col] = 0;
            }
        }
    }
    public static boolean isItPlaceSafeForQueen(int[][] chess,int row,int col)
    {
        for(int i=row-1,j=col-1;j>=0 && i>=0;j--,i--)
        {
            if(chess[i][j]==1)
            {
                return false;
            }
        }
        for(int i=row-1,j=col+1;j<chess.length && i>=0;i--,j++)
        {
            if(chess[i][j]==1)
            {
                return false;
            }
        }
        for(int i=row-1,j=col;i>=0;i--)
        {
            if(chess[i][j]==1)
            {
                return false;
            }
        }
        return true;
    }
}
