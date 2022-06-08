package HashMapAndHeap;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MedianPriorityQueue {

	PriorityQueue<Integer> left;
	PriorityQueue<Integer> right;
	
	MedianPriorityQueue()
	{
		left = new PriorityQueue<>(Collections.reverseOrder());
		right = new PriorityQueue<>();
	}
	
	public void add(int val)//TC = O(logn)
	{
		if(right.size()!=0 && val>right.peek())
		{
			right.add(val);
		}
		else
		{
			left.add(val);
		}
		if(left.size()-right.size()==2)
		{
			right.add(left.remove());
		}
		else if(right.size()-left.size()==2)
		{
			left.add(right.remove());
		}
	}
	public int remove()//TC = O(logn)
	{
		if(this.size()==0)
		{
			System.out.println("Underflow");
			return -1;
		}
		if(left.size()>=right.size())
		{
			return left.remove();
		}
		else
		{
			return right.remove();
		}
	}
	public int peek()//TC = O(1)
	{
		if(this.size()==0)
		{
			System.out.println("Underflow");
			return -1;
		}
		if(left.size()>=right.size())
		{
			return left.peek();
			
		}
		else
		{
			return  right.peek();
		}
	}
	public int size() //TC = O(1)
	{
		return left.size() + right.size();
	}
		// TODO Auto-generated method stub
		public static void main(String[] args) throws Exception {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    MedianPriorityQueue qu = new MedianPriorityQueue();

		    String str = br.readLine();
		    while (str.equals("quit") == false) {
		      if (str.startsWith("add")) {
		        int val = Integer.parseInt(str.split(" ")[1]);
		        qu.add(val);
		      } else if (str.startsWith("remove")) {
		        int val = qu.remove();
		        if (val != -1) {
		          System.out.println(val);
		        }
		      } else if (str.startsWith("peek")) {
		        int val = qu.peek();
		        if (val != -1) {
		          System.out.println(val);
		        }
		      } else if (str.startsWith("size")) {
		        System.out.println(qu.size());
		      }
		      str = br.readLine();
		    }
		}

}
