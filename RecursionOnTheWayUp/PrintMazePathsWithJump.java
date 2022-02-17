package DSALevel1.RecursionAndBacktracking.RecursionOnTheWayUp;

import java.util.Scanner;

public class PrintMazePathsWithJump {
	 public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        String psf = "";
	        printMazePaths(1,1,n,m,psf);
	    }

	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

	        if(sr>dr || sc>dc)
	        {
	            return;
	        }
	        if(sr==dr && sc==dc)
	        {
	            System.out.println(psf);
	            return;
	        }
	       for(int ms=1;ms<=dc-sc;ms++)
	       {
	           printMazePaths(sr,sc+ms,dr,dc,psf+"h"+ms);
	       }
	       for(int ms=1;ms<=dr-sr;ms++)
	       {
	           printMazePaths(sr+ms,sc,dr,dc,psf+"v"+ms);
	       }
	       for(int ms=1;ms<=dc-sc && ms<=dr-sr;ms++)
	       {
	           printMazePaths(sr+ms,sc+ms,dr,dc,psf+"d"+ms);
	       } 
	       
	    }

}
