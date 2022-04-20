package DSALevel1.GenericTree;
//TC = O(n)
//SC = O(n)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class LevelOrderOfGenericTree {
	
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
	public static void levelOrder(Node node)
	{
		Queue<Node> queue = new ArrayDeque<>();
		queue.add(node);
		while(queue.size()>0)
		{
			Node temp = queue.remove();
			System.out.print(temp.data + " ");
			for(Node child : temp.children)
			{
				queue.add(child);
			}
		}
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
		    levelOrder(root);
		  }
}
