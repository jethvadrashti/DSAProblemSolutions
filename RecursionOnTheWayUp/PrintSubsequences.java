package DSALevel1.RecursionAndBacktracking.RecursionOnTheWayUp;
//TC = O(2^n)
//SC = O(1) actually but for recursion recursion stack space usage. 
import java.util.Scanner;

public class PrintSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ans ="";
		subsequences(str,ans);
	}
	public static void subsequences(String str,String ans)
	{
		if(str.length()==0)
		{
			System.out.println(ans);
			return;
		}
		char first = str.charAt(0);
		String ros = str.substring(1);
		subsequences(ros,ans+first);
		subsequences(ros,ans+"");
	}
}
