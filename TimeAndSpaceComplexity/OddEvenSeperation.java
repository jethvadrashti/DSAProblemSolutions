package DSALevel1.TimeAndSpaceComplexity;
//TC = O(n)
//SC = O(1)
import java.util.Scanner;

public class OddEvenSeperation {
	public static void oddEven(int[] arr)
	{
		int i=0,j=0;
		while(i<arr.length)
		{
			if(arr[i] % 2 == 0)
			{
				i++;
			}
			else
			{
				swap(arr,i,j);
				i++;
				j++;
			}
		}
	}
	 public static void swap(int[] arr, int i, int j) {
		    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
		    int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		  }

		  public static void print(int[] arr) {
		    for (int i = 0; i < arr.length; i++) {
		      System.out.print(arr[i] + " ");
		    }
		    System.out.println();
		  }

		  public static void main(String[] args) throws Exception {
		    Scanner scn = new Scanner(System.in);
		    int n = scn.nextInt();
		    int[] arr = new int[n];
		    for (int i = 0; i < n; i++) {
		      arr[i] = scn.nextInt();
		    }
		    oddEven(arr);
		    print(arr);
		  }
}