package DSALevel1.RecursionAndBacktracking.RecursionToArrayList;
//TC = O(n)
//SC = O(1) However we consider recursive stack space usage,then TC = O(n).
import java.util.ArrayList;
import java.util.Scanner;

public class GetKPC {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> res = getKPC(str);
        System.out.println(res);
    }
    static String[] codes = {".;","abc","def","ght","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {                                  //1
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
    }
 
    char ch = str.charAt(0);                                      //2
    String ros = str.substring(1);                                //3
    ArrayList<String> rres = getKPC(ros);                           //4
    ArrayList<String> mres = new ArrayList<>();
 
    String codeforch = codes[ch - '0'];                           //5
 
    for (int i = 0; i < codeforch.length(); i++) {
      char chcode = codeforch.charAt(i);
      for (String val : rres) {                                   //6
        mres.add(chcode + val);
      }
    }
    return mres; 
    }

}
