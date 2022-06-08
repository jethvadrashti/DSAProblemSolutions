package HashMapAndHeap;
import java.util.*;
//TC = O(n)
//SC = O(n)
public class HigestFrequencyCharacter {

	public static void findHighestFrequencyCharacter(String str)
	{
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(!hm.containsKey(ch))
			{
				hm.put(ch, 1);
			}
			else
			{
				int val = hm.get(ch);
				hm.put(ch, val+1);
			}
		}
		
		int max = Integer.MIN_VALUE;
		
		for(Character ch : hm.keySet())
		{
			int freq = hm.get(ch);
			
			if(freq>max)
			{
				max = freq;
			}
		}
		
		for(Character ch : hm.keySet())
		{
			int freq = hm.get(ch);
			if(freq==max)
			{
				System.out.println(ch);
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		findHighestFrequencyCharacter(str);
	}
}
