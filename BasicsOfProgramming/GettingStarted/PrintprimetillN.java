package DSALevel1.BasicsOfProgramming.GettingStarted;
//TC = O((high-low)*squareroot(i))
//SC = O(1)
import java.util.Scanner;

public class PrintprimetillN {

	public static void main(String[] args) {
		// TODO Auto-geierated method stub
		
		Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for(int i = low;i<=high;i++)
        {
            int j = 2;
            while(j*j<=i)
            {
                if(i%j==0)
                {
                    break;
                }
                j++;
            }
            if(j*j>i)
            {
                System.out.println(i);
            }
        }
	}

}
