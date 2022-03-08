package DSALevel1.StackAndQueue;
//TC = O(n)
//SC = O(n)
import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
	 public static  boolean isValid(String s) {
		 Stack<Character> st = new Stack<>();
		 for(int i=0;i<s.length();i++)
		 {
			 char ch = s.charAt(i);
			 if(ch!=')')
			 {
				 st.push(ch);
			 }
			 else
			 {
				 if(st.peek()=='(')
				 {
					 return true;
				 }
				 else
				 {
					 while(st.peek()!='(')
					 {
						 st.pop();
					 }
					 st.pop();
				 }
			 }
		 }
		 return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean ans = isValid(s);
		System.out.println(ans);
	}

}
