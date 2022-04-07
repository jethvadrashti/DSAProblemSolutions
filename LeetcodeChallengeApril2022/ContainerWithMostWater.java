package LeetcodeChallengeApril2022;
//TC = O(n)
//SC = O(1)
import java.util.Scanner;

public class ContainerWithMostWater {

	public static int mostWater(int[] height)
	{
		int maxArea = Integer.MIN_VALUE;
		int i = 0;
		int j = height.length-1;
		while(i!=j)
		{
			int width = j-i;
			int ht = Math.min(height[i], height[j]);
			int area = width * ht;
			if(area>maxArea)
			{
				maxArea = area;
			}
			if(ht==height[i])
			{
				i++;
			}
			else if(ht==height[j])
			{
				j--;
			}
			else if(height[i]==height[j])
			{
				i++;
			}
		}
		return maxArea;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] height = new int[n];
		for(int i=0;i<n;i++)
		{
			height[i] = sc.nextInt();
		}
		int ans = mostWater(height);
		System.out.println(ans);
	}
/*
 nput: height = [1,8,6,2,5,4,8,3,7]
Output: 49
 */
}
