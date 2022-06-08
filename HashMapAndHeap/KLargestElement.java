package HashMapAndHeap;

import java.util.*;
//TC = O(nlogk)
//SC = O(k)
public class KLargestElement {

	public static int kthLargestEle(int[] arr,int k)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for(int i=0;i<arr.length;i++)//O(nlogk)
		{
			if(i<k)
			{
				pq.add(arr[i]);
			}
			else
			{
				if(arr[i]>pq.peek())
				{
					pq.poll();
					pq.add(arr[i]);
				}
			}
		}
	
		return pq.peek();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1  = sc.nextInt();
		int[] arr = new int[n1];
		for(int i=0;i<n1;i++)
		{
			arr[i] = sc.nextInt();
 		}
		int k = sc.nextInt();
		int ans = kthLargestEle(arr,k);
		System.out.println(ans);
	}

}
