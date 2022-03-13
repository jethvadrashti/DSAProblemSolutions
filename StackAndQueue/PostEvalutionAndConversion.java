package DSALevel1.StackAndQueue;
//TC = O(n)
//SC = O(n)
import java.util.Scanner;
import java.util.Stack;

public class PostEvalutionAndConversion {

	
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
		String exp = sc.next();
		
		Stack<Integer> vs = new Stack<>();
		Stack<String>  is = new Stack<>();
		Stack<String>  pre = new Stack<>();
		
		for(int i=0;i<exp.length();i++)
		{
			char ch = exp.charAt(i);
			
			if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
			{
				int val2 = vs.pop();
				int val1 = vs.pop();
				int temp = operation(val1,val2,ch);
				vs.push(temp);
				
				String is2 = is.pop();
				String is1 = is.pop();
				String isval = "("+is1+ch+is2+")";
				is.push(isval);
				
				String pre2 = pre.pop();
				String pre1 = pre.pop();
				String preval = ch+pre1+pre2;
				pre.push(preval);
			}
			else
			{
				vs.push(ch-'0');
				is.push(ch+"");
				pre.push(ch+"");
			}
		}
		System.out.println(vs.pop());
		System.out.println(is.pop());
		System.out.println(pre.pop());
	}

}
