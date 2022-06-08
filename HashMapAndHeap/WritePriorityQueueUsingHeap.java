package HashMapAndHeap;
import java.util.*;
//TC = O(nlogn)
//SC = O(n)
public class WritePriorityQueueUsingHeap {

	public static class PriorityQueue{
		
		ArrayList<Integer> data = new ArrayList<>();
		
		public void add(int val)
		{
			data.add(val);
			
			upheapify(data.size()-1);
		}
		public void swap(int i,int j)
		{
			int temp = data.get(i);
			data.set(i, data.get(j));
			data.set(j, temp);
		}
		public void upheapify(int i)
		{
			if(i==0)
			{
				return;
			}
			int pi = (i -1)/2;
			
			if(data.get(i)<data.get(pi))
			{
				swap(i,pi);
			}
			upheapify(pi);
		}
		public int peek()
		{
			swap(0,data.size()-1);

			int val = data.get(data.size()-1);
			
			downheapify(0);
			
			return val;
		}
		public int remove()
		{
			swap(0,data.size()-1);

			int val = data.remove(data.size()-1);
					
			downheapify(0);
			
			return val;
		}
		public void downheapify(int i)
		{
			if(i==data.size()-1)
			{
				return;
			}
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
		public int size()
		{
			return data.size();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		*/
		PriorityQueue pq = new PriorityQueue();
		
		pq.add(10);
		System.out.println(pq.peek());
		
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		pq.add(60);
		
		pq.remove();
		System.out.println(pq.peek());
	}

}
