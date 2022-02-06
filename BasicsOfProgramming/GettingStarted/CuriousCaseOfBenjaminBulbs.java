package DSALevel1.BasicsOfProgramming.GettingStarted;
//TC = O(squareroot(n))
//SC = O(1)
import java.util.Scanner;

public class CuriousCaseOfBenjaminBulbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    for(int i=1;i*i<=n;i++)
		    {
		      System.out.println(i*i);
		    }
	}

}
