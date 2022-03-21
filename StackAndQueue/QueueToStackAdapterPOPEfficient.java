package DSALevel1.StackAndQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
//TC = O(1) for POP & PEEK only otherwise O(n)
//SC = O(n)
import DSALevel1.StackAndQueue.QueueToStackAdapterPUSHEfficient.QueueToStackAdapter;
//Queue Adapter stack :PUSH Efficient
/*
Queue adapt stack means queue perform all operations like stack. push.pop.top,size,etc. but push efficient means TC of POP = O(1) fix. 
*/
public class QueueToStackAdapterPOPEfficient {
	
	public static class QueueToStackAdapter {
	    Queue<Integer> mainQ;
	    Queue<Integer> helperQ;

	    public QueueToStackAdapter() {
	      mainQ = new ArrayDeque<>();
	      helperQ = new ArrayDeque<>();
	    }
	    int pop()
	    {
	    	if(mainQ.size()==0)
	    	{
	    		System.out.println("Queue underflow");
	    		return -1;
	    	}
	    	else
	    	{
	    		return mainQ.remove();
	    	}
	    }
	    int top()
	    {
	    	if(mainQ.size()==0)
	    	{
	    		System.out.println("Queue underflow");
	    		return -1;
	    	}
	    	else
	    	{
	    		return mainQ.peek();
	    	}
	    }
	    int size()
	    {
	    	return mainQ.size();
	    }
	    void push(int val)
	    {
	    	while(mainQ.size()>0)
	    	{
	    		helperQ.add(mainQ.remove());
	    	}
	    	mainQ.add(val);
	    	while(helperQ.size()>0)
	    	{
	    		mainQ.add(helperQ.remove());
	    	}
	    }
	    
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    QueueToStackAdapter st = new QueueToStackAdapter();

	    String str = br.readLine();
	    while (str.equals("quit") == false) {
	      if (str.startsWith("push")) {
	        int val = Integer.parseInt(str.split(" ")[1]);
	        st.push(val);
	      } else if (str.startsWith("pop")) {
	        int val = st.pop();
	        if (val != -1) {
	          System.out.println(val);
	        }
	      } else if (str.startsWith("top")) {
	        int val = st.top();
	        if (val != -1) {
	          System.out.println(val);
	        }
	      } else if (str.startsWith("size")) {
	        System.out.println(st.size());
	      }
	      str = br.readLine();
	    }
	  }
	}
}
