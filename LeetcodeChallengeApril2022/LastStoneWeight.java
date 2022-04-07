package LeetcodeChallengeApril2022;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class LastStoneWeight {

	public static int lastStoneWeight(int[] stones)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		 for (int n : stones) {
	            pq.offer(n);
	        }

	        while (pq.size() > 1) {
	            int st = pq.poll();
	            int nd = pq.poll();

	            if (st > nd) {
	                pq.offer(st - nd);
	            }
	        }

	        if (pq.isEmpty()) {
	            return 0;
	        }

	        return pq.peek();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] stones = new int[n];
			for(int i=0;i<n;i++)
			{
				stones[i] = sc.nextInt();
			}
			int ans = lastStoneWeight(stones);
			System.out.println(ans);
	}
/*
 6
 Input: stones = [2,7,4,1,8,1]
Output: 1
 */
}
