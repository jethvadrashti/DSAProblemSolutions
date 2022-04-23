package DSALevel1.GenericTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

/*
  For all the approach have same Time complexity & Space complexity TC = O(n) & SC = O(n)
 */
public class LevelofOrderLinewise2 {
	private static class Node
	{
		int data;
		ArrayList<Node> children = new ArrayList<>();
		Node node;
		Node()
		{
			
		}
		Node(int data)
		{
			this.data = data;
		}
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
	public static void levelOrderlinewise2(Node node)
	{
		//LevelOrderWithoutLine
		/*
		Queue<Node> queue = new ArrayDeque<>();
		queue.add(node);
		
		while(queue.size()>0)
		{
			node = queue.remove();
			System.out.print(node.data+" ");
			for(Node child : node.children)
			{
				queue.add(child);
			}
		}
		*/
		
		//LevelOrderLineWise => Approach-1
		/*
		Queue<Node> mainQ = new ArrayDeque<>();
		Queue<Node> childQ = new ArrayDeque<>();
		mainQ.add(node);
		while(mainQ.size()>0)
		{
			node = mainQ.remove();
			System.out.print(node.data+" ");
			for(Node child : node.children)
			{
				childQ.add(child);
			}
			if(mainQ.size()==0)
			{
				mainQ = childQ;
				childQ = new ArrayDeque<>();
				System.out.println();
			}
		}
		*/
		
		//LevelOrderLineWise  => Approach - 2
		/*
		Queue<Node> mainQ = new ArrayDeque<>();
		mainQ.add(node);
		mainQ.add(new Node(-1));
		
		while(mainQ.size()>0)
		{
			node = mainQ.remove();
			if(node.data!=-1)
			{
				System.out.print(node.data+" ");
				for(Node child : node.children)
				{
					mainQ.add(child);
				}
			}
			else
			{
				if(mainQ.size()>0)
				{
					mainQ.add(new Node(-1));
					System.out.println();
				}
			}
		}
		*/
		
		//LevelOrderLinewise  => Approach-3
		
		/*
		Queue<Node> mainQ = new ArrayDeque<>();
		mainQ.add(node);
		
		while(mainQ.size()>0)
		{
			int sizeOfChildInQueue = mainQ.size();
			for(int i=1;i<=sizeOfChildInQueue;i++)
			{
				node = mainQ.remove();
				System.out.print(node.data+" ");
				
				for(Node child : node.children)
				{
					mainQ.add(child);
				}
			}
			System.out.println();
			
		}
	}
		*/
	}
		//LevelOrderLineWise Approach => 4	
		private static class Pair{
			Node node;
			int level;
			Pair(Node node,int level)
			{
				this.node = node;
				this.level = level;
			}
		}
		public static void levelOrderlinewise(Node node)
		{
			int level = 1;
			Queue<Pair> pair = new ArrayDeque<>();
			pair.add(new Pair(node,1));
			while(pair.size()>0)
			{
				Pair newNode = pair.remove();
				
				if(newNode.level>level)
				{
					level = newNode.level;
					System.out.println();
				}
				System.out.print(newNode.node.data+" ");
				for(Node child : newNode.node.children)
				{
					pair.add(new Pair(child,level+1));
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
		    levelOrderlinewise(root);
		  }

}
