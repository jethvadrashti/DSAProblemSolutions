package DSALevel1.TimeAndSpaceComplexity;

import java.util.Scanner;

/*
Applications of merge sort

Merge sort is helpful to sort a linked list in O(N logN) time.
Merge sort is useful for counting inversion in a list or array.
Merge sort is useful for external sorting. Which is useful when the result does not fit in memory.


Drawbacks of Merge Sort

Merge sort is not efficient for sorting input of large size if you are having low stack space.
Merge sort while sorting the array goes through the entire process even if the array is sorted.
Merge sort takes an extra space of O(n) in standard(Outplace) implementation.
*/
 
//TC  = O(nlogn)
//SC  = O(n)
public class MergeSort {
	public static int[] mergeSort(int[] arr, int lo, int hi) {
	    //write your code here
	    if(lo==hi)
	    {
	      int[] ba = new int[1];
	      ba[0] = arr[lo];
	      return ba;
	    }
	    int mid = lo + hi >> 1;
	    int[] fsh = mergeSort(arr,lo,mid);
	    int[] ssh = mergeSort(arr,mid+1,hi);
	    int[] ans = mergeTwoSortedArrays(fsh,ssh);
	    return ans;
	  }

	  //used for merging two sorted arrays
	  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
	    System.out.println("Merging these two arrays ");
	    System.out.print("left array -> ");
	    print(a);
	    System.out.print("right array -> ");
	    print(b);
	    int i = 0, j =0, k = 0;
	    int[] ans = new int[a.length + b.length];
	    while(i < a.length && j < b.length){
	        if(a[i] <= b[j]){
	          ans[k] = a[i];
	          i++;
	          k++;
	        }else{
	          ans[k] = b[j];
	          j++;
	          k++;
	        }
	    }

	    while(i < a.length){
	      ans[k] = a[i];
	      k++;
	      i++;
	    }

	    while(j < b.length){
	      ans[k] = b[j];
	      k++;
	      j++;
	    }
	    
	    return ans;
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
	    int[] sa = mergeSort(arr,0,arr.length - 1);
	    System.out.print("Sorted Array -> ");
	    print(sa);
	  }

}
