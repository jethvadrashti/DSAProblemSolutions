package DSALevel1.BasicsOfProgramming.FunctionsAndArrays;
//TC = O(log10n)
//SC = O(1)
import java.util.Scanner;

public class DigitFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here
        int temp = n;
        int count = 0;
        while(n!=0)
        {
            int rem = n%10;
            if(rem==d)
            {
                count++;
            }
            n/=10;
        }
        return count;
	}

}
