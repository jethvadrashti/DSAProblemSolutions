package DSALevel1.StackAndQueue;
//TC = O(n)
//SC = O(n)
import java.util.Scanner;
import java.util.Stack;

public class PrefixEvaluationAndConversion {

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
		Scanner sc = new Scanner(System.in);
		String exp = sc.next();
		
		Stack<Integer> vs = new Stack<>();
		Stack<String>  is = new Stack<>();
		Stack<String>  post = new Stack<>();
		
		for(int i=exp.length()-1;i>=0;i--)
		{
			char ch = exp.charAt(i);
			
			if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
			{
				int val1 = vs.pop();
				int val2 = vs.pop();
				int temp = operation(val1,val2,ch);
				vs.push(temp);
				
				String is1 = is.pop();
				String is2 = is.pop();
				String isval = "("+is1+ch+is2+")";
				is.push(isval);
				
				String post1 = post.pop();
				String post2 = post.pop();
				String postval = post1+post2+ch;
				post.push(postval);
			}
			else
			{
				vs.push(ch-'0');
				is.push(ch+"");
				post.push(ch+"");
			}
		}
		System.out.println(vs.pop());
		System.out.println(is.pop());
		System.out.println(post.pop());

	}

}
