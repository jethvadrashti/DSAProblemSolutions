package BinaryTree;
//TC = O(n)
//SC = O(n)

/*
-> This question is nor directly asked like find diameter of BT. But they asked like find the optimum area in which if we rotate the BT
   or spin a BT, and still all the node are available in this particular area.
-> Also asked question like planets are available in galaxy and then how can I rotate in particular area, that all nodes are available
   in particular kaksha. 
-> Area = Pi * d * d;
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

import BinaryTree.NodeToKLevel.Node;
import BinaryTree.NodeToKLevel.Pair;

public class DiameterOfBT {
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
	public static int height(Node node)
	{
		if(node==null)
		{
			return -1;
		}
		int lf = height(node.left);
		int rh = height(node.right);
		
		int th = Math.max(lf, rh)+1;
		return th;
	}
	/*public static int diameter(Node node) 
	{
		if(node==null)
		{
			return 0;
		}
		
		int ld = diameter(node.left);
		int rd = diameter(node.right);
		int f = height(node.left) + height(node.right) + 2; //because of this height recursion TC = O(n^2)
		int ans = Math.max(Math.max(ld, rd), f);
		return ans;
	}*/
	static class DiaPair{
		int ht;
		int dia;
	}
	public static DiaPair diameter(Node node)
	{
		if(node==null)
		{
			DiaPair bp = new DiaPair();
			bp.ht = -1;
			bp.dia = 0;
			return bp;
		}
		
		DiaPair ltd = diameter(node.left);
		DiaPair rtd = diameter(node.right);
		
		DiaPair rd  = new DiaPair();
		rd.ht = Math.max(ltd.ht,rtd.ht) + 1;
		rd.dia = Math.max(ltd.ht + rtd.ht + 2,Math.max(ltd.dia, rtd.dia));
		
		return rd;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
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

		    //int data = Integer.parseInt(br.readLine());
		    //int k = Integer.parseInt(br.readLine());

		    Node root = construct(arr);
		    
		    DiaPair ans = diameter(root);
		    
		    System.out.println(ans.dia);
	}

}
