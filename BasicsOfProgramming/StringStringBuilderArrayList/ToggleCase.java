package DSALevel1.BasicsOfProgramming.StringStringBuilderArrayList;
//TC = O(n)
//SC = O(n)
import java.util.Scanner;

public class ToggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(toggleString(str));
	}
	public static String toggleString(String str)
	{
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				char temp = (char)(ch - 'A' + 'a');
				sb.append(temp);
			}
			else
			{
				char temp  = (char)(ch - 'a' + 'A');
				sb.append(temp);
			}
		}
		return sb.toString();
	}

}

