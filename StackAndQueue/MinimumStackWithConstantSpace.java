package DSALevel1.StackAndQueue;
//TC = O(1)
//SC = O(1)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class MinimumStackWithConstantSpace {
	
	
	 public static class MinStack {
		    Stack<Integer> data;
		    int min;

		    public MinStack() {
		      data = new Stack<>();
     }
	 int size()
	 {
		 return data.size();
	 }
	 int pop()
	 {
		 if(size()==0)
		 {
			 System.out.println("Stack Underflow");
			 return -1;
		 }
		 else if(data.peek()>=min)
		 {
			 int val = data.pop();
			 return val;
		 }
		 else
		 {
			 int val = min;
			 min = 2 * min - data.pop();
			 return val;
		 }
	 }
	 int top()
	 {
		 if(size()==0)
		 {
			 System.out.println("Stack Underflow");
			 return -1;
		 }
		 else if(data.peek()>=min)
		 {
			 int val = data.peek();
			 return val;
		 }
		 else
		 {
			 int val = min;
			 return val;
		 }
	 }
	 void push(int val)
	 {
		 if(size()==0)
		 {
			 data.push(val);
			 min = val;
		 }
		 else if(val>=data.peek())
		 {
			 data.push(val);
		 }
		 else
		 {
			 data.push(val+val-min);
			 min = val;
		 }
	 }
	 int min()
	 {
		 if(size()==0)
		 {
			 System.out.println("Stack Underflow");
			 return -1;
		 }
		 else
		 {
			 return min;
		 }
	 }
	 public static void main(String[] args) throws Exception {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    MinStack st = new MinStack();

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
		      } else if (str.startsWith("min")) {
		        int val = st.min();
		        if (val != -1) {
		          System.out.println(val);
		        }
		      }
		      str = br.readLine();
		    }
		  }
	 }
}
