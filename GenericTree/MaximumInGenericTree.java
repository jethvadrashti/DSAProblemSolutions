package DSALevel1.GenericTree;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//TC = O(n)
//SC = O(n)
public class MaximumInGenericTree {

	private static class Node{
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}
	public static void display(Node node)
	{
		StringBuilder str = new StringBuilder();
		str.append(node.data + " -> ");
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
				if(st.size()>0)
				{
					st.peek().children.add(newNode);
				}
				else
				{
					root = newNode;
				}
				st.push(newNode);
			}
		}
		return root;
	}
	public static int max(Node node)
	{
		int maxElement = Integer.MIN_VALUE;
		
		for(Node child : node.children)
		{
			int maxChild = max(child);
			if(maxChild > maxElement)
			{
				maxElement = maxChild;
			}
		}
		if(node.data > maxElement)
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
		    int m = max(root);
		    System.out.println(m);
		    // display(root);
		  }
}
