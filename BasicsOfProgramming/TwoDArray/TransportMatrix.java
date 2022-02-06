package DSALevel1.BasicsOfProgramming.TwoDArray;
//TC = O(row*row) = O(n^2)
//SC = O(1)
import java.util.Scanner;

public class TransportMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    int row = sc.nextInt();
		    int[][] arr = new int[row][row];
		    for(int i=0;i<row;i++)
		    {
		        for(int j=0;j<row;j++)
		        {
		            arr[i][j] = sc.nextInt();
		        }
		    }
		    for(int i=0;i<arr.length;i++)
		    {
		    	for(int j=i;j<arr[0].length;j++)
		    	{
		    		int temp = arr[i][j];
		    		arr[i][j] = arr[j][i];
		    		arr[j][i] = temp;
		    	}
		    }
		    int l = 0;
		    int r = arr[0].length-1;
		    while(l<=r)
		    {
		    	for(int i=0;i<arr.length;i++)
		    	{
		    		int temp = arr[i][l];
		    		arr[i][l] = arr[i][r];
		    		arr[i][r] = temp;
		    	}
		    	l++;
		    	r--;
		    }
		  display(arr);
	}
	 public static void display(int[][] arr){
	        for(int i = 0; i < arr.length; i++){
	            for(int j = 0; j < arr[0].length; j++){
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
