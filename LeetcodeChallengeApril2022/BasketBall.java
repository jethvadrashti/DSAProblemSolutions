package LeetcodeChallengeApril2022;

import java.util.Scanner;
import java.util.Stack;

public class BasketBall {

	  public static int calPoints(String[] ops) {
	        
	        Stack<Integer> st = new Stack<>();
	        
	        for(int i=0;i<ops.length;i++)
	        {
	            String temp = ops[i];
	            
	            if(!temp.equals("+") && !temp.equals("C") && !temp.equals("D"))
	            {
	                int Element = Integer.parseInt(temp, 10);
	                st.push(Element);
	            }
	            else if(temp.equals("+"))
	            {
	                int num1 = st.pop();
	                int num2 = st.pop();
	                
	                int ans = num1 + num2;
	                st.push(num2);
	                st.push(num1);
	                st.push(ans);
	            }
	            else if(temp.equals("D"))
	            {
	                int num1 = st.pop();
	                int multiply = num1 * 2;
	                st.push(num1);
	                st.push(multiply);
	            }
	            else if(temp.equals("C"))
	            {
	                st.pop();
	            }
	        }
	        int sum = 0;
	        while(st.size()>0)
	        {
	            sum += st.pop();
	        }
	        return sum;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] ops = new String[n];
		for(int i=0;i<n;i++)
		{
			ops[i] = sc.next();
		}
		int result  =  calPoints(ops);
		System.out.println(result);
		
	}
/*
Input: ops = ["5","-2","4","C","D","9","+","+"]
Output: 27
 */
}
