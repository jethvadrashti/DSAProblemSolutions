package DSALevel1.GenericTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//TC = O(n)
//SC = O(n)
public class HeightOfGenericTreeByEdge {

	private static class Node
	{
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}
	public static Node construct(int[] arr)
	{
		Node root = null;
		
		Stack<Node> st = new Stack<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == -1)
			{
				st.pop();
			}
			else
			{
				Node newNode = new Node();
				newNode.data = arr[i];
				if(st.size()==0)
				{
					root = newNode;
				}
				else
				{
					st.peek().children.add(newNode);
				}
				st.add(newNode);
			}
		}
		return root;
	}
	public static void display(Node node)
	{
		StringBuilder str = new StringBuilder();
		str.append(node.data+" --> ");
		for(Node child : node.children)
		{
			str.append(child.data + ",");
		}
		str.append(".");
		System.out.println(str);
		
		for(Node child : node.children)
		{
			display(child);
		}
	}
	public static int height(Node node) {
		int ht = -1; // by using edge that's why -1 otherwise if by using node then we initialize by 1 for sure.
		for(Node child : node.children)
		{
			int childHt = height(child);
			ht = Math.max(ht, childHt);
		}
		ht += 1;
		return ht;
	}
	
	public static int size(Node node)
	{
		int sz = 0;
		for(Node child : node.children)
		{
			int childSize = size(child);
			sz += childSize;
		}
		sz += 1;
		return sz;
	}
	public static int max(Node node)
	{
		int maxElement  = Integer.MIN_VALUE;
		
		for(Node child : node.children)
		{
			int childMax = max(child);
			maxElement = Math.max(childMax, maxElement);
		}
		if(node.data>maxElement)
		{
			maxElement = node.data;
		}
		return maxElement;
	}
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    int[] arr = new int[n];
	    String[] values = br.readLine().split(" ");
	    for (int i = 0; i < n; i++) {
	      arr[i] = Integer.parseInt(values[i]);
	    }

	    Node root = construct(arr);
	    int h = height(root);
	    System.out.println(h);
	    // display(root);
	  }

}
