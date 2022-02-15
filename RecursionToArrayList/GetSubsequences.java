package DSALevel1.RecursionAndBacktracking.RecursionToArrayList;
//TC = O(n)
//SC = O(1) However we consider recursive stack space usage,then TC = O(n).
import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequences {
	 public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        ArrayList<String> ans = gss(str);
	        System.out.println(ans);
	    }

	    public static ArrayList<String> gss(String str) {
	        if(str.length()==0)
	        {
	            ArrayList<String> r = new ArrayList<>();
	            r.add("");
	            return r;
	        }
	       char first = str.charAt(0);
	       String restOfString = str.substring(1);
	       ArrayList<String> temp = gss(restOfString);
	       ArrayList<String> ans = new ArrayList<>();
	       for(String res : temp)
	       {
	           ans.add(""+res);
	       }     
	        for(String res : temp)
	       {
	           ans.add(first+res);
	       }       
	       return ans; 
	    }

}
