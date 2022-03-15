package DSALevel1.StackAndQueue;
//TC = O(n)
//SC = O(n)
import java.util.Scanner;
import java.util.Stack;

public class CelebrityProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
	    findCelebrity(a);
	}
	public static void findCelebrity(int[][] a)
	{
		Stack<Integer> st = new Stack<>();
		
		for(int i=0;i<a.length;i++)
		{
			st.push(i);
		}
		while(st.size()>1)
		{
			int i = st.pop();
			int j = st.pop();
			
			if(a[i][j]==1)
			{
				st.push(j);
			}
			else
			{
				st.push(i);
			}
		}
		int pot = st.pop();
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            if (i != pot) {
                if (a[i][pot] == 0 || a[pot][i] == 1) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            System.out.println(pot);
        } else {
            System.out.println("none");
        }

	}
}

/*
4
0000
1011
1101
1110
 */
