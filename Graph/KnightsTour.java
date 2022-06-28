package Graph;
//TC = O(8*(n*n))
//SC = O(n*n)
import java.util.Scanner;

public class KnightsTour {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int[][] chess = new int[n][n];
		
		knightTour(chess,row,col,1);
	}
	public static void knightTour(int[][] chess,int r, int c,int move)
	{
		if(r<0 || c<0 || r>=chess.length || c>= chess[0].length || chess[r][c]>0)
		{
			return;
		}
		else if(move==chess.length*chess.length)
		{
			chess[r][c] = move;
			display(chess);
			chess[r][c] = 0;
			return;
		}
		
		chess[r][c] = move;
		
		knightTour(chess,r-2,c+1,move+1);
		knightTour(chess,r-1,c+2,move+1);
		knightTour(chess,r+1,c+2,move+1);
		knightTour(chess,r+2,c+1,move+1);
		knightTour(chess,r+2,c-1,move+1);
		knightTour(chess,r+1,c-2,move+1);
		knightTour(chess,r-1,c-2,move+1);
		knightTour(chess,r-2,c-1,move+1);
		
		chess[r][c] = 0;
	}
	public static void display(int[][] chess)
	{
		 for(int i = 0; i < chess.length; i++){
	            for(int j = 0; j < chess[0].length; j++){
	                System.out.print(chess[i][j] + " ");
	            }
	            System.out.println();
	        }

	        System.out.println();
	}
}
