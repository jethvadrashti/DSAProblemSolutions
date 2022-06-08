package HashMapAndHeap;
import java.util.*;
/*Priority Queue methods :- add() => TC = O(logn);
  						    remove() => TC = O(logn); 
  						    peek() => TC = O(1)
  						    
  By default Priority Queue's priority is smallest Value.
  But if we want to set Priority for largest value, then we have write Collections.reverseOrder().
 
 */
public class CreateHeapAndItsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100,45,67,90,89,23,44,1000};
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		//TC = O(nlogn)  
		for(int val : arr)//TC = O(n)
		{
			pq.add(val);//TC = O(logn)
		}
		System.out.println(pq);
		
		
		//TC = O(nlogn) Sorted Array using Heap Sort with using space.
		while(pq.size()>0) //O(n)
		{
			System.out.print(pq.peek()+"  ");//O(1)
			pq.remove();//O(logn)
		}
	}

}
