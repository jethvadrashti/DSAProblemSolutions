package DSALevel1.GenericTree;
import java.util.*;
import java.util.Scanner;

public class GenericTreePreOrderIteratorByUsingInterface {

	private  static class Node{
		
		int data;
		ArrayList<Node> children = new ArrayList<>();
		
	}
	
	
	public static class GenericTree implements  Iterable<Integer>{
		
		Node root;
		
		GenericTree(Node root)
		{
			this.root = root;
		}
		
		public Iterator<Integer> iterator()
		{
			Iterator obj = new GTPreorder(root);
			return obj;
		}
	}
	public static class GTPreorder implements Iterator<Integer>
	{
		Integer nval;
		Stack<Pair> st;
		public GTPreorder(Node root)
		{
			st = new Stack<>();
			st.push(new Pair(root,-1));
			next();
		}
		public boolean hasNext()
		{
			if(nval==null)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		
		public Integer next()
		{
			Integer fr = nval;
			
			nval = null;

			while(st.size()>0)
			{
				Pair top = st.peek();
				if(top.state==-1)
				{
					nval = top.node.data;
					top.state++;
					break;
				}
				else if(top.state>=0 && top.state < top.node.children.size())
				{
					Pair cp = new Pair(top.node.children.get(top.state),-1);
					st.push(cp);
					top.state++;
				}
				else
				{
					st.pop();
				}
			}
			return fr;
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
	public static Node constructGT(int[] arr)
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

	public static void display(Node node)
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append(node.data + " -> ");
		
		for(Node child : node.children)
		{
			sb.append(child.data +" ");
		}
		sb.append(".");
		System.out.println(sb);
		for(Node child : node.children)
		{
			display(child);
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		Node root = constructGT(arr);
		//display(root);
		
		GenericTree gt = new GenericTree(root);
		/*
		for(int val : gt)
		{
			System.out.println(val);
		}
		 or below both are same*/
		Iterator<Integer> gti = gt.iterator();
		
		while(gti.hasNext()==true)
		{
			System.out.println(gti.next());
		}
		
	}
}
