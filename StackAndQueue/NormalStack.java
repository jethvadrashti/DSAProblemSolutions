package DSALevel1.StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NormalStack {
	
	public static class CustomStack{
		
		int[] data;
		int tos = -1;
		public CustomStack(int cap)
		{
			data = new int[cap];
		    tos = -1;
		}
		//PUSH
		//TC = O(1)
		//SC = O(1)
		void push(int val)
		{
			if(tos==data.length-1)
			{
				System.out.println("Stack Overflow");
			}
			else
			{
				tos++;
				data[tos] = val;
			}
		}
		//Display
		//TC = O(n)
		//SC = O(1)
		void display()
		{
			for(int i=tos;i>=0;i--)
			{
				System.out.print(data[i]+" ");
			}
			System.out.println();
		}
		//Size
		//TC = O(1)
		//SC = O(1)
		int size()
		{
			return tos + 1;
		}
		//POP
		//TC = O(1)
		//SC = O(1)
		int pop()
		{
			if(tos==-1)
			{
				System.out.println("Stack Underflow");
				return -1;
			}
			else
			{
				int val = data[tos];
				tos--;
				return val;
			}
		
		}
		//TOP
		//TC = O(1)
		//SC = O(1)
		int top()
		{
			if(tos==-1)
			{
				System.out.println("Stack Underflow");
				return -1;
			}
			else
			{
				int val = data[tos];
				return val;
			}
		}
		
	}

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int n = Integer.parseInt(br.readLine());
		    CustomStack st = new CustomStack(n);

		    String str = br.readLine();
		    while(str.equals("quit") == false){
		      if(str.startsWith("push")){
		        int val = Integer.parseInt(str.split(" ")[1]);
		        st.push(val);
		      } else if(str.startsWith("pop")){
		        int val = st.pop();
		        if(val != -1){
		          System.out.println(val);
		        }
		      } else if(str.startsWith("top")){
		        int val = st.top();
		        if(val != -1){
		          System.out.println(val);
		        }
		      } else if(str.startsWith("size")){
		        System.out.println(st.size());
		      } else if(str.startsWith("display")){
		        st.display();
		      }
		      str = br.readLine();
		    }
		  }
}

	


