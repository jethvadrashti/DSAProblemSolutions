package BinaryTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
/*
  Balanced Tree => All the nodes which are present in BT must be follow the balanced tree property, then we can say that BT 
  							is Balanced BT. if one of the node doesn't follow the rule, then it is not balanced BT.
  							
  Balanced Tree Property => Height of the node (Math.abs(node.left's height - node.right's height))<=1
  
  //TC = O(n)
  //SC = O(lognbase2)  
      if we consider recursive stack space, then at any point of time space required by stack which is lognbase2. 
      SC = O(h)  h = maximum height of tree h = lognbase2
 */
import BinaryTree.BTBasics.Node;
import BinaryTree.BTBasics.Pair;

public class BalancedTree {
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
	 public static class IsBalanced{
	        boolean isbal;
	        int height;
	    }
	    public static IsBalanced isBalTree(Node node)
	    {
	        if(node==null)
	        {
	            IsBalanced bp = new IsBalanced();
	            bp.isbal = true;
	            bp.height = -1;
	            return bp;
	        }
	        
	        IsBalanced lsh = isBalTree(node.left);
	        IsBalanced rsh = isBalTree(node.right);
	        
	        IsBalanced res = new IsBalanced();
	        
	        res.isbal = lsh.isbal && rsh.isbal && Math.abs(lsh.height-rsh.height)<=1;
	        res.height = Math.max(lsh.height,rsh.height) + 1;
	        return res;
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
	    IsBalanced ans = isBalTree(root);
	    System.out.println(ans.isbal);
	}
}
//3,9,20,null,null,15,7
//[0,2,4,1,null,3,-1,5,1,null,6,null,8]
