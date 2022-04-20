package DSALevel1.GenericTree;
//TC = O(n)
//SC = O(n)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class TraversalinGenericTree {
	
	private static class Node
	{
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}
	public static void display(Node node)
	{
		StringBuilder str = new StringBuilder();
		str.append(node.data + " --> ");
		
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
			int maxChild = max(child);
			if(maxChild > maxElement)
			{
				maxElement = maxChild;
			}
		}
		if(node.data>maxElement)
		{
			maxElement = node.data;
		}
		return maxElement;
	}
	//ht = 0 when we consider find the height in terms of Edge of the tree
	//ht = -1 when we consider find the height in terms of Node of the tree
	public static int height(Node node)
	{
		int ht = -1;
		for(Node child : node.children)
		{
			int childH = height(child);
			ht = Math.max(ht, childH);
		}
		ht += 1;
		return ht;
	}
	public static Node construct(int[] arr)
	{
		Node root = null;
		Stack<Node> st = new Stack<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==-1)
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
				st.push(newNode);
			}

		}
		return root;
	}
	public static void traversals(Node node)
	{
		System.out.println("Pre Node " + node.data);
		
		for(Node child : node.children)
		{
			System.out.println("Pre Edge "+ node.data + "---"+child.data);
			traversals(child);
			System.out.println("Post Edge "+ node.data + "---"+child.data);
		}
		
		System.out.println("Post Node " + node.data);
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
	    traversals(root);
	  }
}
