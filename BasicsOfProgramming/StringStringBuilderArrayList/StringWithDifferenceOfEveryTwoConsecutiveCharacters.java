package DSALevel1.BasicsOfProgramming.StringStringBuilderArrayList;
//TC = O(n)
//SC = O(n)
import java.util.ArrayList;
import java.util.Scanner;

public class StringWithDifferenceOfEveryTwoConsecutiveCharacters {

	
	public static String solution(String str){
		// write your code here
		StringBuilder sb = new StringBuilder(str.charAt(0)+"");
		for(int i=1;i<str.length();i++)
		{
			int temp = str.charAt(i) - str.charAt(i-1);
			sb.append(temp);
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}
}
