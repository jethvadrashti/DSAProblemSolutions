package HashMapAndHeap;

import java.util.*;

public class MyEfficientAddMethodPriorityQueue {

	public static class PriorityQueue{
		
		ArrayList<Integer> data;
		public PriorityQueue()
		{
			data = new ArrayList<>();
			
		}
		public void add(int val)
		{
			data.add(val);
			upheapify(data.size()-1);
		}
		public void upheapify(int i)
		{
			if(i==0)
			{
				return;
			}
			
			int pi = (i-1)/2;
			if(data.get(pi)>data.get(i))
			{
				swap(i,pi);
				upheapify(pi);
			}
		}
		public void swap(int i,int j)
		{
			int temp = data.get(i);
			data.set(i, data.get(j));
			data.set(j, temp);
		}
		public Integer peek()
		{
			if(data.size()<0)
			{
				return null;
			}
			else
			{
				Integer val = data.get(0);
				upheapify(data.size()-1);
				return val;
			}
		}
		public Integer remove()
		{
			if(data.size()<0)
			{
				return null;
			}
			else
			{
				Integer val = data.get(0);
				data.remove(val);
				upheapify(data.size()-1);
				return val;
			}
		}
		public int size()
		{
			return data.size();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100,45,67,90,89,23,44,1000};
		PriorityQueue pq = new PriorityQueue();
		//TC = O(nlogn)  
		for(int val : arr)//TC = O(n)
		{
			pq.add(val);//TC = O(logn)
		}
		
		System.out.println(pq.peek());
		
		System.out.println(pq.remove());
		
		System.out.println(pq.peek());
		System.out.println(pq.remove());
		//TC = O(nlogn) Sorted Array using Heap Sort with using space.
		/*while(pq.size()>0) //O(n)
		{
			System.out.print(pq.peek()+"  ");//O(1)
			pq.remove();//O(logn)
		}*/

	}

}
