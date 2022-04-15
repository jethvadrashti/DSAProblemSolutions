package DSALevel1.GenericTree;
//TC = O(n)
//SC = O(n)
import java.util.*;
public class DisplayGenericTree {

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
			str.append(child.data+" , ");
		}
		str.append(".");
		System.out.println(str);
		
		
		for(Node child : node.children)
		{
			display(child);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,-1,90,-1,-1,40,100,-1,-1,-1};
		
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
		display(root);
	}

}
