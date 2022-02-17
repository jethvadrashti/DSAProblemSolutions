package DSALevel1.RecursionAndBacktracking.RecursionOnTheWayUp;
//TC = O(2^n)
//SC = O(1) actually but for recursion recursion stack space usage. 
import java.util.Scanner;

public class GetKPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ans ="";
		getkpc(str,ans);
	}
	static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	public static void getkpc(String str,String ans)
	{
		if(str.length()==0)
		{
			System.out.println(ans);
			return;
		}
		char first = str.charAt(0);
		String ros = str.substring(1);
		String temp = codes[first-'0'];
		for(int i=0;i<temp.length();i++)
		{
			getkpc(ros,ans+temp.charAt(i));
		}
	}
}
