package DSALevel1.RecursionAndBacktracking.RecursionToArrayList;
//TC = O(3^n)
//SC = O(1) However we consider recursive stack space usage,then TC = O(n).
import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPath {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);
    }

    public static ArrayList<String> getStairPaths(int n) {

        if(n==0)
        {
            ArrayList<String> brea = new ArrayList<>();
            brea.add("");
            return brea;
        }
        else if(n<0)
        {
            ArrayList<String> brea = new ArrayList<>();
            return brea;
        }
        ArrayList<String> paths1 = getStairPaths(n-1);
        ArrayList<String> paths2 = getStairPaths(n-2);
        ArrayList<String> paths3 = getStairPaths(n-3);

        ArrayList<String> result = new ArrayList<>();

        for(String path : paths1)
        {
            result.add(1+path);
        }
        for(String path : paths2)
        {
            result.add(2+path);
        }
        for(String path : paths3)
        {
            result.add(3+path);
        }
        return result;
    }

}
