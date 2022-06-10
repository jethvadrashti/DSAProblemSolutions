package HashMapAndHeap;
//TC = O(n)
//SC = O(n)
import java.util.*;

public class EfficientWayToWritePriorityQueueUsingHeap {

	public static class PriorityQueue{
		
		ArrayList<Integer> data;
		
		public PriorityQueue()
		{
			data = new ArrayList<>();
		}
		
		public PriorityQueue(int[] arr)
		{
			data = new ArrayList<>();

			for(int val : arr)
			{
				data.add(val);
			}
			for(int i=data.size()/2 - 1;i>=0;i--)
			{
				downheapify(i);
			}
		}
		
		public int remove()
		{
		  if(this.size()==0)
	      {
	        System.out.println("Underflow");
	        return -1;
	      }
			swap(0,data.size()-1);
	
			int val = data.remove(data.size()-1);
					
			downheapify(0);
			
			return val;
		}
		public int peek()
		{
		  if(this.size()==0)
	      {
	        System.out.println("Underflow");
	        return -1;
	      }
			
			return data.get(0);
		}
		public void downheapify(int i)
		{

			int min = i;
			
			int left = 2*i + 1;
			int right = 2 *i + 2;
			
			if(left<data.size() && data.get(left)<data.get(min))
			{
				min = left;
			}
			if(right<data.size() && data.get(right)<data.get(min))
			{
				min = right;
			}
			
			if(min!=i)
			{
				swap(min,i);
				downheapify(min);
			}
		}
		public void swap(int i,int j)
		{
			int temp = data.get(i);
			data.set(i,data.get(j));
			data.set(j, temp);
		}
		public int size()
		{
			return data.size();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100,1000,200,400,300,600,500,700,900,800};
		PriorityQueue pq = new PriorityQueue(arr);
		
		while(pq.size()>0)
		{
			System.out.print(pq.peek()+" ");
			pq.remove();
		}
	}

}
