package DSALevel1.BasicsOfProgramming.Pattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);

	        // write ur code here
	        int n = scn.nextInt();
	        for(int i=1;i<=n;i++)
	        {
	            for(int spc=1;spc<i;spc++)
	            {
	                System.out.print("\t");
	            }
	            for(int j=n;j>=i;j--)
	            {
	                System.out.print("*\t");
	            }
	            System.out.println();
	        }
	}

}
/*
5
*	*	*	*	*	
	*	*	*	*	
		*	*	*	
			*	*	
				*	
*/
