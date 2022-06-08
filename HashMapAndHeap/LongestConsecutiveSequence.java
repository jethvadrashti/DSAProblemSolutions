package HashMapAndHeap;
import java.util.*;
//TC = O(n)
//SC = O(n)
public class LongestConsecutiveSequence {

	public static void longestConsecutiveSequence(int[] arr)
	{
		HashMap<Integer,Boolean> hm = new HashMap<>();
		
		for(int res : arr)
		{
			hm.put(res, true);
		}
		
		for(int res : arr)
		{
			if(hm.containsKey(res-1))
			{
				hm.put(res, false);
			}
		}
		int ml = Integer.MIN_VALUE;
		int msp = 0;
		for(int res : arr)
		{
			if(hm.get(res)==true)
			{
				int tl = 1;
				int tsp = res;
				while(hm.containsKey(tsp+tl)==true)
				{
					tl++;
				}
				
				if(tl>ml)
				{
					ml = tl;
					msp = tsp;
				}
			}
		}
		for(int i=0;i<ml;i++)
		{
			System.out.println(msp+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] =sc.nextInt();
		}
		longestConsecutiveSequence(arr);
	}

}
