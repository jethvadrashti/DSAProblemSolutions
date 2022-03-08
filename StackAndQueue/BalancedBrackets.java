package DSALevel1.StackAndQueue;
//TC = O(n)
//SC = O(n)
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static boolean isValid(String s)
	{
		Stack<Character> st = new Stack<>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[')
			{
				st.push(ch);
			}
			else if(ch==')')
			{
				boolean ans = closingBracketCheck(st, '(');
				if(ans==false)
				{
					return false;
				}
			}
			else if(ch=='}')
			{
				boolean ans = closingBracketCheck(st, '{');
				if(ans==false)
				{
					return false;
				}
			}
			else if(ch==']')
			{
				boolean ans = closingBracketCheck(st, '[');
				if(ans==false)
				{
					return false;
				}
			}
		}
		if(st.size()==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean closingBracketCheck(Stack<Character> st,char corch)
	{
		if(st.size()==0)
		{
			return false;
		}
		else
		{
			if(st.peek()==corch)
			{
				st.pop();
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean ans = isValid(s);
		System.out.println(ans);

	}

}
