package BinaryTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

import BinaryTree.BTBasics.Node;
import BinaryTree.BTBasics.Pair;

//TC = O(n)
//SC = O(h) where h = height of tree.
public class NodeToRootPath {
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
	public static boolean find(Node node,int data)
	{
		if(node==null)
		{
			return false;
		}
		if(node.data==data)
		{
			return true;
		}
		
		boolean lfind = find(node.left,data);
		if(lfind)
		{
			return true;
		}
		
		boolean rfind = find(node.right,data);
		if(rfind)
		{
			return true;
		}
		return false;
	}
	public static ArrayList<Integer> nodeToRootPath(Node node,int data)
	{
		if(node==null)
		{
			return new ArrayList<Integer>();
		}
		
		if(node.data==data)
		{
			ArrayList<Integer> list = new ArrayList<>();
			list.add(node.data);
			return list;
		}
		
		ArrayList<Integer> llist = nodeToRootPath(node.left,data);
		if(llist.size()>0)
		{
			llist.add(node.data);
			return llist;
		}
		
		ArrayList<Integer> rlist = nodeToRootPath(node.right,data);
		if(rlist.size()>0)
		{
			rlist.add(node.data);
			return rlist;
		}
		return new ArrayList<Integer>();
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
	    int data = Integer.parseInt(br.readLine());

	    Node root = construct(arr);
	    boolean found = find(root, data);
	    System.out.println(found);

	    ArrayList<Integer> path = nodeToRootPath(root, data);
	    System.out.println(path);
	}
}
