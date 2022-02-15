package DSALevel1.RecursionAndBacktracking.RecursionToArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePatWithJump {

	 public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        ArrayList<String> ans = getMazePaths(1,1,n,m);
	        System.out.println(ans);
	    }

	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
	    	if(sr==dr || sc==dc)
	    	{
	    		ArrayList<String> brea = new ArrayList<>();
	    		brea.add("");
	    		return brea;
	    	}
	    	ArrayList<String> paths = new ArrayList<>();
	    	
	    	//horizontal moves
	    	for(int ms=1;ms<=dc-sc;ms++)
	    	{
	    		ArrayList<String> hpaths = getMazePaths(sr,sc+ms,dr,dc);
	    		for(String hpath : hpaths)
	    		{
	    			paths.add("h" + ms + hpath);
	    		}
	    	}
	    	
	    	//Vertical moves
	    	for(int ms = 1;ms<=dr-sr;ms++)
	    	{
	    		ArrayList<String> vpaths = getMazePaths(sr+ms,sc,dr,dc);
	    		for(String vpath : vpaths)
	    		{
	    			paths.add("v"+ms+vpath);
	    		}
	    	}
	    	
	    	//Diagonal moves
	    	for(int ms = 1;ms<=dr-sr && ms<=dc-sc;ms++)
	    	{
	    		ArrayList<String> dpaths = getMazePaths(sr+ms,sc+ms,dr,dc);
	    		for(String dpath : dpaths)
	    		{
	    			paths.add("d" + ms +dpath);
	    		}
	    	}
	        return paths;
	    }

}
