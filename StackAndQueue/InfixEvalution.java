package DSALevel1.StackAndQueue;
//TC = O(n)
//SC = O(n)
import java.util.Scanner;
import java.util.Stack;

public class InfixEvalution {

	
	public static int infixEvalution(String s)
	{
		Stack<Integer> operands = new Stack<>();
		Stack<Character> operators = new Stack<>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch=='(')
			{
				operators.push(ch);
			}
			else if(Character.isDigit(ch))
			{
				operands.push(ch-'0');
			}
			else if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
			{
				while(operators.size()>0 && operators.peek()!='(' && precedence(ch)<=precedence(operators.peek()))
				{
					int v2 = operands.pop();
					int v1 = operands.pop();
					char op = operators.pop();
					int temp = operation(v1,v2,op);
					operands.push(temp);
				}
				operators.push(ch);
			}
			else if(ch==')')
			{
				while(ch!='(')
				{
					int v2 = operands.pop();
					int v1 = operands.pop();
					char op = operators.pop();
					int temp = operation(v1,v2,op);
					operands.push(temp);
				}
				operators.pop();
			}
		}
		while(operators.size()!=0)
		{
			int v2 = operands.pop();
			int v1 = operands.pop();
			char op = operators.pop();
			int temp = operation(v1,v2,op);
			operands.push(temp);
		}
		return operands.peek();
	}
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
	public static int operation(int v1,int v2,char operator)
	{
		if(operator=='+')
		{
			return v1 + v2;
		}
		else if(operator=='-')
		{
			return v1 - v2;
		}
		else if(operator=='*')
		{
			return v1 * v2;
		}
		else
		{
			return v1 / v2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = infixEvalution(s);
		System.out.println(ans);
	}

}
