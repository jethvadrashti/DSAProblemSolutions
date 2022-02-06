package DSALevel1.BasicsOfProgramming.TwoDArray;
//TC = O(row* column) = O(n^2)
//SC = O(1)
import java.util.Scanner;

public class ExitPointInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] a = new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        int dir = 0; // 0-->e 1-->s 2-->w 3-->n
        int i=0,j=0;
        while(true)
        {
        	dir = (dir+a[i][j]) % 4;
        	if(dir==0)
            {
            	j++;
            }
            else if(dir==1)
            {
            	i++;
            }
            else if(dir==2)
            {
            	j--;
            }
            else if(dir==3)
            {
            	i--;
            }
            
            if(i<0)
            {
            	i++;
            	break;
            }
            else if(j<0)
            {
            	j++;
            	break;
            }
            else if(i==a.length)
            {
            	i--;
            	break;
            }
            else if(j==a[0].length)
            {
            	j--;
            	break;
            }
        }
        System.out.println(i);
        System.out.println(j);
        
	}

}
