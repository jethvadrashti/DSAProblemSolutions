package DSALevel1.StackAndQueue;
//TC = O(n)
//SC = O(n)
import java.util.Scanner;
import java.util.Stack;

public class InfixConversion {
	public static int precedence(char operator)
	{
		if(operator=='+')
		{
			return 1;
		}
		else if(operator=='-')
		{
			return 1;
		}
		else if(operator=='*')
		{
			return 2;
		}
		else
		{
			return 2;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		Stack<String> prefix = new Stack<>();
		Stack<String> postfix = new Stack<>();
		Stack<Character> operators = new Stack<>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch=='(')
			{
				operators.push(ch);
			}
			else if(ch>='0' && ch<='9' || ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			{
				prefix.push(ch+"");
				postfix.push(ch+"");
			}
			else if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
			{
				while(operators.size()>0 && operators.peek()!='(' && precedence(ch)<=precedence(operators.peek()))
				{
					String prev2 = prefix.pop();
					String prev1 = prefix.pop();
					char op = operators.pop();
					String postv2 = postfix.pop();
					String postv1 = postfix.pop();
					String tempPrefix =op+prev1+prev2;
					String tempPostfix =postv1+postv2+op;
					prefix.push(tempPrefix);
					postfix.push(tempPostfix);
				}
				operators.push(ch);
			}
			else if(ch==')')
			{
				while(operators.peek()!='(')
				{
					String prev2 = prefix.pop();
					String prev1 = prefix.pop();
					char op = operators.pop();
					String postv2 = postfix.pop();
					String postv1 = postfix.pop();
					String tempPrefix =op+prev1+prev2;
					String tempPostfix =postv1+postv2+op;
					prefix.push(tempPrefix);
					postfix.push(tempPostfix);
				}
				operators.pop();
			}
		}
		while(operators.size()!=0)
		{
			String prev2 = prefix.pop();
			String prev1 = prefix.pop();
			char op = operators.pop();
			String postv2 = postfix.pop();
			String postv1 = postfix.pop();
			String tempPrefix =op+prev1+prev2;
			String tempPostfix =postv1+postv2+op;
			prefix.push(tempPrefix);
			postfix.push(tempPostfix);
		}
		System.out.println(postfix.peek());
		System.out.println(prefix.peek());
	}
	
	
}
