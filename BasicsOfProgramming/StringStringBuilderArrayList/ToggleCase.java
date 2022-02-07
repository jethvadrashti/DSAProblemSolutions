package DSALevel1.BasicsOfProgramming.StringStringBuilderArrayList;

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
		String ans = "";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				char temp = (char)(ch - 'A' + 'a');
				ans += temp;
			}
			else
			{
				char temp  = (char)(ch - 'a' + 'A');
				ans += temp;
			}
		}
		return ans;
	}

}
