package DSALevel1.BasicsOfProgramming.StringStringBuilderArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
		
	}
	public static void solution(ArrayList<Integer> al){
		// write your code here
		for(int i=al.size()-1;i>=0;i--)
		{
			boolean ans = true;
			for(int j=2;j*j<=al.get(i);j++)
			{
				if(al.get(i) % j==0)
				{
					ans = false;
					break;
				}
			}
			if(ans)
			{
				al.remove(i);
			}
		}
	}
}
