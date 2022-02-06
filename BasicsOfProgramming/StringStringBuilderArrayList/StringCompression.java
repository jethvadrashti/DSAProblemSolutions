package DSALevel1.BasicsOfProgramming.StringStringBuilderArrayList;

import java.util.Scanner;

public class StringCompression {

	public static String compression1(String str){
		// write your code here
		String ans ="";
		int i=0;
		while(i<str.length())
		{
			int j = i;
			while(str.charAt(i)==str.charAt(j))
			{
				j++;
			}
			i = j;
			ans += str.charAt(j-1);
		}
		return ans;
	}

	public static String compression2(String str){
		// write your code here

		return null;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		//System.out.println(compression2(str));
	}
}
