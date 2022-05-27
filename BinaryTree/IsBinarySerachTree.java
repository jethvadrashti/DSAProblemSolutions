package BinaryTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

import BinaryTree.BTBasics.Node;
import BinaryTree.BTBasics.Pair;
//TC = O(n)
//SC = O(lognbase2)
/*
    if we consider recursive stack space, then at any point of time space required by stack which is lognbase2. 
    SC = O(h)  h = maximum height of tree h = lognbase2
    */
public class IsBinarySerachTree {
	public static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data,Node left,Node right)
		{
			this.data = data;
			this.left = left;
			this.right= right;
		}
	}
	public static class Pair{
		Node node;
		int state;
		
		Pair(Node node,int state)
		{
			this.node = node;
			this.state = state;
		}
	}
	public static Node construct(Integer[] arr)
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
	 public static class BST{
		    boolean isbst;
		    int min;
		    int max;
		  }
		  public static BST isBst(Node node)
		  {
		      if(node==null)
		      {
		        BST bp = new BST();
		        bp.isbst = true;
		        bp.min = Integer.MAX_VALUE;
		        bp.max = Integer.MIN_VALUE;
		        return bp;
		      }
		      BST leftsubtree = isBst(node.left);
		      BST rightsubtree = isBst(node.right);

		      BST rootNode = new BST();
		      rootNode.isbst = leftsubtree.isbst && rightsubtree.isbst &&
		                       (node.data>=leftsubtree.max &&
		                       node.data<=rightsubtree.min);
		      rootNode.min = Math.min(node.data,Math.min(leftsubtree.min,rightsubtree.min));
		      rootNode.max = Math.max(node.data,Math.max(leftsubtree.max,rightsubtree.max));
		      
		      return rootNode;
		      
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
	    
	    //display(root);
	}
}
