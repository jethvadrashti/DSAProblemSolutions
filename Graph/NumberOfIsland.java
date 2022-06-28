package Graph;
//TC = O(4*n*m)
//SC = O(n*m)
import java.util.Scanner;

public class NumberOfIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		int count = 0;
		boolean[][] visited = new boolean[n][m];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j]==0 && visited[i][j]==false)
				{
					drawTree(arr,i,j,visited);
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static void drawTree(int[][] arr,int i,int j,boolean[][] visited)
	{
		
		if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]==1 || visited[i][j]==true)
		{
			return;
		}
		
		visited[i][j] = true;
		
		drawTree(arr,i-1,j,visited);
		drawTree(arr,i,j+1,visited);
		drawTree(arr,i+1,j,visited);
		drawTree(arr,i,j-1,visited);
		
	}

}
