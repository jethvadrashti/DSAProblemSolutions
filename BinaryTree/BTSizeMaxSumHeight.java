package BinaryTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
//TC = O(n)
//SC = O(n)
import BinaryTree.BTBasics.Node;
import BinaryTree.BTBasics.Pair;

public class BTSizeMaxSumHeight {
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
	public static int size(Node node)
	{
		if(node==null) {
			return 0;
		}
		int ls = size(node.left);
		int rs = size(node.right);
		int ts = ls + rs + 1;
		return ts;
	}
	public static int max(Node node)
	{
		if(node==null)
		{
			return Integer.MIN_VALUE;
		}
		int lm = max(node.left);
		int rm = max(node.right);
		int tm = Math.max(lm, rm);
		int ans = Math.max(node.data, tm);
		return ans;
	}
	public static int sum(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		int ls = sum(node.left);
		int rs = sum(node.right);
		int ts = ls + rs + node.data;
		return ts;
	}
	public static int height(Node node)
	{
		if(node==null)
		{
			return -1;
		}
		int lh = height(node.left);
		int rh = height(node.right);
		int th = Math.max(lh, rh) + 1;
		return th;
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
	    
	    int size = size(root);
	    int max = max(root);
	    int sum = sum(root);
	    int height = height(root);
	    
	    System.out.println(size);
	    System.out.println(max);
	    System.out.println(sum);
	    System.out.println(height);
	}
}
