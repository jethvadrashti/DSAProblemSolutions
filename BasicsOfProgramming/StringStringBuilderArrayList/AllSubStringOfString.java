package DSALevel1.BasicsOfProgramming.StringStringBuilderArrayList;
import java.util.*;
public class AllSubStringOfString {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				System.out.println(str.substring(i,j));
			}
		}
	}
}
//abc
/*
 a
 ab
 abc
 b
 bc
 c
 */
