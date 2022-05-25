package BinaryTree;
//TC = O(n/2)  because we have to skip nodes which are repeated in tree in left cloned => O(n) 
//SC = O(1), but if consider stack space,then SC = O(d) => d = maximum depth of the tree.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

import BinaryTree.TransformToLeftClonedTree.Node;
import BinaryTree.TransformToLeftClonedTree.Pair;

public class TransformLeftClonedToNormal {
	public static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data,Node left,Node right)
		{
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	public static class Pair{
		Node node;
		int state;
		
		Pair(Node node,int state)
		{
			this.node= node;
			this.state =state;
		}
	}public static Node construct(Integer[] arr)
	{
		Node root = new Node(arr[0],null,null);
		
		Stack<Pair> st = new Stack<>();
		
		st.push(new Pair(root,1));
		int idx = 0;
		while(st.size()>0)
		{
			Pair top = st.peek();
			
			if(top.state==1)
			{
				idx++;
				if(arr[idx] !=null)
				{
					Node lc = new Node(arr[idx],null,null);
					top.node.left = lc;
					st.push(new Pair(top.node.left,1));
				}
				else
				{
					top.node.left = null;
				}
				top.state++;
			}
			else if(top.state==2)
			{
				idx++;
				if(arr[idx] !=null)
				{
					Node rc = new Node(arr[idx],null,null);
					top.node.right = rc;
					st.push(new Pair(top.node.right,1));
				}
				else
				{
					top.node.right = null;
				}
				top.state++;
			}
			else
			{
				st.pop();
			}
		}
		
		return root;
	}
	public static void display(Node node)
	{
		if(node==null)
		{
			return;
		}
		StringBuilder sb  = new StringBuilder();
		sb.append(node.left==null?"." :node.left.data+" ");
		sb.append(" -> "+node.data + " <- ");
		sb.append(node.right==null?"." :node.right.data+" ");
		
		System.out.println(sb);
		
		display(node.left);
		display(node.right);
	}
	public static Node transformInNormalCloned(Node node)
	{
		if(node==null)
		{
			return null;
		}
		
		Node ltr = transformInNormalCloned(node.left.left);
		Node rtr = transformInNormalCloned(node.right);
		
		node.left = ltr;
		node.right = rtr;
		
		return node;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    Integer[] arr = new Integer[n];
	    String[] values = br.readLine().split(" ");
	    for (int i = 0; i < n; i++) {
	      if (values[i].equals("n") == false) {
	        arr[i] = Integer.parseInt(values[i]);
	      } else {
	        arr[i] = null;
	      }
	    }
	   
	    Node root = construct(arr);
	   
	    root = transformInNormalCloned(root);
	    
	    display(root);
	   
	}
}
