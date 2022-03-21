package DSALevel1.StackAndQueue;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//TC = O(1) for Add only otherwise O(n)
//SC = O(n)

//Stack Adapter Queue :ADD Efficient
/*
Stack adapt Queue means stack perform all operations like queue. Add,remove,peek,size,etc. but add efficient means TC of ADD = O(1) fix. 
*/
public class StackToQueueAdapterAddEfficient {

	public static class StackToQueueAdapter {
	    Stack<Integer> mainS;
	    Stack<Integer> helperS;

	    public StackToQueueAdapter() {
	      mainS = new Stack<>();
	      helperS = new Stack<>();
	    }
	    
	    int size()
	    {
	    	return mainS.size();
	    }
	    void add(int val)
	    {
	    	mainS.push(val);
	    }
	    int remove()
	    {
	    	if(mainS.size()==0)
	    	{
	    		System.out.println("Queue underflow");
	    		return -1;
	    	}
	    	while(mainS.size()>0)
	    	{
	    		helperS.push(mainS.pop());
	    	}
	    	int val = helperS.pop();
	    	while(helperS.size()>0)
	    	{
	    		mainS.push(helperS.pop());
	    	}
	    	return val;
	    }
	    int peek()
	    {
	    	if(mainS.size()==0)
	    	{
	    		System.out.println("Queue underflow");
	    		return -1;
	    	}
	    	while(mainS.size()>0)
	    	{
	    		helperS.push(mainS.pop());
	    	}
	    	int val = helperS.peek();
	    	while(helperS.size()>0)
	    	{
	    		mainS.push(helperS.pop());
	    	}
	    	return val;
	    }
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StackToQueueAdapter qu = new StackToQueueAdapter();

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
}
