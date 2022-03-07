package DSALevel1.StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static boolean isValid(String s)
	{
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
			{
				st.push(s.charAt(i));
			}
			else if(s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}')
			{
				if(st.size()==0)
				{
					return false;
				}
				else
				{
					if(st.peek()==s.charAt(i))
					{
						st.pop();
					}
					else
					{
						return false;
					}
				}
			}
		}
		if(st.size()!=0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean ans = isValid(s);
		System.out.println(ans);

	}

}
