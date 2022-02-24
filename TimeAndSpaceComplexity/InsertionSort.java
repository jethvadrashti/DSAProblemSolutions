package DSALevel1.TimeAndSpaceComplexity;
//Worst-case time complexity- O(n2)
//Best Case time complexity- O(n)
//Average Case time complexity- O(n2)
//SC = O(1)
/*
Which sorting algorithm is parsimonious?
A sorting algorithm is parsimonious if it never compares the same pair of input values twice.
For example, insertion sort, top-down mergesort, and quicksort are parsimonious sorting algorithms.
*/
import java.util.Scanner;

public class InsertionSort {
	
	public static void insertionSort(int[] arr)
	{
		
	}
	
	 public static void swap(int[] arr, int i, int j) {
		    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
		    int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		  }

		  // return true if ith element is smaller than jth element
		  public static boolean isSmaller(int[] arr, int i, int j) {
		    System.out.println("Comparing " + arr[i] + " and " + arr[j]);
		    if (arr[i] < arr[j]) {
		      return true;
		    } else {
		      return false;
		    }
		  }

		  public static void print(int[] arr) {
		    for (int i = 0; i < arr.length; i++) {
		      System.out.println(arr[i]);
		    }
		  }

		  public static void main(String[] args) throws Exception {
		    Scanner scn = new Scanner(System.in);
		    int n = scn.nextInt();
		    int[] arr = new int[n];
		    for (int i = 0; i < n; i++) {
		      arr[i] = scn.nextInt();
		    }
		    insertionSort(arr);
		    print(arr);
		  }
}
