package DSALevel1.BasicsOfProgramming.GettingStarted;
import java.util.*;
//TC = O(log10n)
//SC = O(1)
public class CountDigitsInNumber {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int temp = n;
		    int count = 0;
		    while(temp!=0)
		    {
		        temp /= 10;
		        count++;
		    }
		    System.out.println(count);
		   }
	

}
