package DSALevel1.RecursionAndBacktracking.RecursionOnTheWayUp;
//TC = O(2^(n+m)) n = no of rows & m = no f columns
//SC = O(1) 
import java.util.Scanner;

public class PrintMazePaths {
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
	        
			 if(sr > dr || sc > dc){
         return;
     }
		
				if(sr==dr && sc==dc)
				{
					System.out.println(psf);
					return;
				}
				
			
				printMazePaths(sr,sc+1,dr,dc,psf+"h");
				printMazePaths(sr+1,sc,dr,dc,psf+"v");
			
	    }
}
