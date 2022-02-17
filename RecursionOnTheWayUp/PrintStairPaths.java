package DSALevel1.RecursionAndBacktracking.RecursionOnTheWayUp;
//TC = O(3^n)
//SC = O(1) but if consider recrusion stack space then O(n)
import java.util.Scanner;

public class PrintStairPaths {
	  public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        String path = "";
	        printStairPaths(n,path);
	    }

	    public static void printStairPaths(int n, String path) {

	        if(n<=0)
	        {
	           if(n==0)
	           {
	               System.out.println(path);
	           }
	           else
	           {
	               return;
	           }
	        }
	        printStairPaths(n-1,path+1);
	        printStairPaths(n-2,path+2);
	        printStairPaths(n-3,path+3);
	    }

}
