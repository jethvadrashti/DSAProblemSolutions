package HashMapAndHeap;

import java.util.*;
//TC = O(nlogk)
//SC = O(k)
public class SortKSortedArray {

	public static void sortKSortedArray(int[] arr,int k)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<=k;i++)
		{
			pq.add(arr[i]);// O(klogk)
		}
		
		for(int i=k+1;i<arr.length;i++)
		{
			System.out.println(pq.remove());//O((n-k)log(n-k))
			pq.add(arr[i]);//O((n-k)log(n-k))
		}
		while(pq.size()>0)
		{
			System.out.println(pq.remove());//O(klogk)
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		sortKSortedArray(arr,k);
	}

}
