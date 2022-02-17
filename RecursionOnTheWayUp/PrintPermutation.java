package DSALevel1.RecursionAndBacktracking.RecursionOnTheWayUp;
//TC = O(n!)
//SC = O(1)
import java.util.Scanner;

public class PrintPermutation {
	 public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        String str = sc.next();
	        printPermutations(str,"");
	    }

	    public static void printPermutations(String str, String asf) {
	        
	        if(str.length()==0)
	        {
	            System.out.println(asf);
	            return;
	        }
	        for(int i=0;i<str.length();i++)
	        {
	            char ch = str.charAt(i);
	            String lspart = str.substring(0,i);
	            String rspart = str.substring(i+1);
	            String ros = lspart + rspart;
	            printPermutations(ros,asf+ch);
	        }
	    }
}
