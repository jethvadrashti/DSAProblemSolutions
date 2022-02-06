package DSALevel1.BasicsOfProgramming.TwoDArray;
//TC = O(m+n)
//SC = O(n+m)
import java.util.Scanner;

public class RingRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        int row = sc.nextInt();
	        int column = sc.nextInt();
	        int[][] arr = new int[row][column];
	        for(int i=0;i<row;i++)
	        {
	            for(int j=0;j<column;j++)
	            {
	                arr[i][j] = sc.nextInt();
	            }
	        }
	        int s = sc.nextInt();
	        int r = sc.nextInt();

	        int[] oned = filloneDbyShell(arr,s);
	        rotateOneD(oned,r);
	        fillShellbyOneD(oned,arr,s);
	        display(arr);
	}
	public static void fillShellbyOneD(int[] oned,int[][] arr,int s)
    {
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;

        //lw
        int idx = 0;
        for(int i=minr,j=minc;i<=maxr;i++)
        {
            arr[i][j] = oned[idx];
            idx++;
        }
        //bw
        for(int i=maxr,j=minc+1;j<=maxc;j++)
        {
            arr[i][j] = oned[idx];
             idx++;
        }
        //rw
        for(int i=maxr-1,j=maxc;i>=minr;i--)
        {
            arr[i][j] = oned[idx];
             idx++;
        }

        //tw
        for(int i=minr,j=maxc-1;j>minc;j--)
        {
            arr[i][j] = oned[idx];
             idx++;
        }
    }
    public static int[] filloneDbyShell(int[][] arr,int s)
    {
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;
        int sz   = 2 * (maxr-minr + maxc-minc);
        int[] oned = new int[sz];

        //lw
        int idx = 0;
        for(int i=minr,j=minc;i<=maxr;i++)
        {
            oned[idx] = arr[i][j];
            idx++;
        }
        //bw
        for(int i=maxr,j=minc+1;j<=maxc;j++)
        {
            oned[idx] = arr[i][j];
            idx++;
        }
        //rw
        for(int i=maxr-1,j=maxc;i>=minr;i--)
        {
            oned[idx] = arr[i][j];
            idx++;
        }

        //tw
        for(int i=minr,j=maxc-1;j>minc;j--)
        {
            oned[idx] = arr[i][j];
            idx++;
        }
        return oned;
    }
    public static void rotateOneD(int[] oned,int r)
    {
        r = r % oned.length;
        if(r<0)
        {
            r = r + oned.length;
        }
        reverseOned(0,oned.length-r-1,oned);
        reverseOned(oned.length-r,oned.length-1,oned);
        reverseOned(0,oned.length-1,oned);
    }
    public static void reverseOned(int start,int end,int[] oned)
    {
        while(start<end)
        {
            int temp = oned[start];
            oned[start] = oned[end];
            oned[end] = temp;
            start++;
            end--;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
