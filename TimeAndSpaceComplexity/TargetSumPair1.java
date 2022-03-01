package DSALevel1.TimeAndSpaceComplexity;
//TC = O(nlogn) if array is already sorted,then TC = O(n)
//SC = O(1)
import java.util.Scanner;

public class TargetSumPair1 {
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

	  public static void targetSumPair(int[] arr, int target){
	    //write your code here
	     int[] res = mergeSort(arr,0,arr.length-1);
	     //Arrays.sort(arr);
	    int left = 0;
	    int right = res.length-1;
	    while(left<right)
	    {
	      if(res[left]+res[right]<target)
	      {
	          left++;
	      }
	      else if(res[left]+res[right]>target)
	      {
	          right--;
	      }
	      else {
	          System.out.println(res[left]+", "+res[right]);
	          left++;
	          right--;
	      }
	    }
	    
	  }
	  public static void main(String[] args) throws Exception {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0 ;i < n; i++){
	      arr[i] = scn.nextInt();
	    }
	    int target = scn.nextInt();
	    targetSumPair(arr,target);
	  }

}
