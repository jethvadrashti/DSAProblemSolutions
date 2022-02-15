package DSALevel1.RecursionAndBacktracking.RecursionToArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {
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
	        if (sr == dr && sc == dc) {                              //1
	      ArrayList< String> bres = new ArrayList< >();
	      bres.add("");
	      return bres;
	    }
	    ArrayList< String> hpaths = new ArrayList< >();           //2.1
	    ArrayList< String> vpaths = new ArrayList< >();           //2.2

	    if (sc < dc) {
	      hpaths = getMazePaths(sr, sc + 1, dr, dc);          //3.1
	    }
	    if (sr < dr) {
	      vpaths = getMazePaths(sr + 1, sc, dr, dc);          //3.2
	    }

	    ArrayList< String> paths = new ArrayList< >();             //4

	    for (String hpath : hpaths) {
	      paths.add("h" + hpath);                              //5.1
	    }

	    for (String vpath : vpaths) {
	      paths.add("v" + vpath);                              //5.2
	    }
	    return paths;                                            //6
	  }
}
