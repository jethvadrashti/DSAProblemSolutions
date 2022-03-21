package DSALevel1.StackAndQueue;
//TC = O(n)
//SC = O(n)
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DynamicQueue {

	public static class CustomQueue {
	    int[] data;
	    int front;
	    int size;

	    public CustomQueue(int cap) {
	      data = new int[cap];
	      front = 0;
	      size = 0;
	    }
	    void add(int val)
	    {
	    	if(size==data.length)
	    	{
	    		int[] ndata = new int[2 * data.length];
	    		for(int i=0;i<data.length;i++)
	    		{
	    			int idx = (front+i)%data.length;
	    			ndata[i] = data[idx];
	    		}
	    		data = ndata;
	    		front = 0;
	    		int rear = (front+size)%data.length;
		    	data[rear] = val;
		    	size++;
	    	}
	    	else
	    	{
	    	int rear = (front+size)%data.length;
	    	data[rear] = val;
	    	size++;
	    	}
	    }
	    int size()
	    {
	    	return size;
	    }
	    int remove()
	    {
	    	if(size==0)
	    	{
	    		System.out.println("Queue underflow");
	    		return -1;
	    	}
	    	else
	    	{
	    		int val = data[front];
	    		front = (front+1)%data.length;
	    		size--;
	    		return val;
	    	}
	    }
	    int peek()
	    {
	    	if(size==0)
	    	{
	    		System.out.println("Queue underflow");
	    		return -1;
	    	}
	    	else
	    	{
	    		int val = data[front];
	    		
	    		return val;
	    	}
	    }
	    void display()
	    {
	    	for(int i=0;i<size;i++)
	    	{
	    		int idx = (front+i)%data.length;
	    		System.out.print(data[idx]+" ");
	    	}
	    	System.out.println();
	    }
	 public static void main(String[] args) throws Exception {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int n = Integer.parseInt(br.readLine());
		    CustomQueue qu = new CustomQueue(n);

		    String str = br.readLine();
		    while(str.equals("quit") == false){
		      if(str.startsWith("add")){
		        int val = Integer.parseInt(str.split(" ")[1]);
		        qu.add(val);
		      } else if(str.startsWith("remove")){
		        int val = qu.remove();
		        if(val != -1){
		          System.out.println(val);
		        }
		      } else if(str.startsWith("peek")){
		        int val = qu.peek();
		        if(val != -1){
		          System.out.println(val);
		        }
		      } else if(str.startsWith("size")){
		        System.out.println(qu.size());
		      } else if(str.startsWith("display")){
		        qu.display();
		      }
		      str = br.readLine();
		    }
		  }
	}
}
