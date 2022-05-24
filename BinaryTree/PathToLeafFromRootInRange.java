package BinaryTree;
//TC = O(n)
//SC = O(h) where h = height of tree. If we found balanced Binary tree, then SC = O(lognbase2)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;



public class PathToLeafFromRootInRange {
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
	public static void pathToLeafRange(Node node,String path,int sum,int lo,int hi)
	{
		if(node==null)
		{
			return;
		}
		if(node.left==null && node.right==null)
		{
			sum += node.data;
			if(sum>=lo && sum<=hi)
			{
				System.out.println(path+node.data);
			}
			return;
		}
		pathToLeafRange(node.left,path+node.data+" ",sum+node.data,lo,hi);
		pathToLeafRange(node.right,path+node.data+" ",sum+node.data,lo,hi);
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
	    int lo = Integer.parseInt(br.readLine());
	    
	    int hi = Integer.parseInt(br.readLine());
	   
	    Node root = construct(arr);
	    pathToLeafRange(root,"",0,lo,hi);
	    
	       
	    
	   
	}
}
