package HashMapAndHeap;
//TC = O(n)
//SC = O(n)
import java.util.HashMap;
import java.util.Scanner;

public class GetCommonElement2 {

	public static void getCommonElement(int[] a1,int[] a2)
	{
		HashMap<Integer,Integer> hm1 = new HashMap<>();
	    for(int res : a1)
	    {
	        if(!hm1.containsKey(res))
	        {
	            hm1.put(res,1);
	        }
	        else
	        {
	            int val = hm1.get(res);
	            hm1.put(res,val+1);
	        }
	        
	    }
	    
	    for(int res : a2)
	    {
	    	if(hm1.containsKey(res) && hm1.get(res)>0)
	    	{
	    		int val = hm1.get(res);
	    		hm1.put(res, val-1);
	    		System.out.println(res);
	    	}
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1  = sc.nextInt();
		int[] a1 = new int[n1];
		for(int i=0;i<n1;i++)
		{
			a1[i] = sc.nextInt();
 		}
		int n2  = sc.nextInt();
		int[] a2 = new int[n2];
		for(int i=0;i<n2;i++)
		{
			a2[i] = sc.nextInt();
 		}
		getCommonElement(a1,a2);
	}

}
