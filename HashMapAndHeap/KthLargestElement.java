package HashMapAndHeap;
import java.util.*;
public class KthLargestElement {
/*
 	TC = O(2*klogk + 2* (n-k)logk)
 	   = O(2klogk + 2nlogk - 2klogk)
 	   = O(2nlogk)
 	   = O(nlogk)
 	   
 	SC = O(k)
 */
	public static void kthLargestElement(int[] arr,int k)
	{
		 PriorityQueue<Integer> pq = new PriorityQueue <>();
			for (int i = 0; i < arr.length; i++)//
			{
				if (i < k) 
				{
					pq.add(arr[i]);//O(klogk)
				} 
				else
				{
					if (arr[i] > pq.peek())
				    {
						pq.remove();//O((n-k)logk)
						pq.add(arr[i]);//O((n-k)logk)
					}
				}
			}
			
			while (pq.size() > 0) {
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
		kthLargestElement(arr,k);
	}

}
