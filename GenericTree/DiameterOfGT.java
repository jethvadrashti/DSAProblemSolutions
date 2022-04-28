package DSALevel1.GenericTree;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//TC = O(n)
//SC = O(h) => h = height of tree
public class DiameterOfGT {
	  private static class Node {
		    int data;
		    ArrayList<Node> children = new ArrayList<>();
		  }

		  public static void display(Node node) {
		    String str = node.data + " -> ";
		    for (Node child : node.children) {
		      str += child.data + ", ";
		    }
		    str += ".";
		    System.out.println(str);

		    for (Node child : node.children) {
		      display(child);
		    }
		  }

		  public static Node construct(int[] arr) {
		    Node root = null;

		    Stack<Node> st = new Stack<>();
		    for (int i = 0; i < arr.length; i++) {
		      if (arr[i] == -1) {
		        st.pop();
		      } else {
		        Node t = new Node();
		        t.data = arr[i];

		        if (st.size() > 0) {
		          st.peek().children.add(t);
		        } else {
		          root = t;
		        }

		        st.push(t);
		      }
		    }

		    return root;
		  }
		  static int diameter = 0;
		  public static int diameterOfGT(Node node)
		  {
			  int deepestHeight = -1;
			  int secondDeepestHeight = -1;
			  
			  for(Node child : node.children)
			  {
				  int childHeight = diameterOfGT(child);
				  if(childHeight>deepestHeight)
				  {
					  secondDeepestHeight = deepestHeight;
					  deepestHeight = childHeight;
				  }
				  else if(childHeight>secondDeepestHeight)
				  {
					  secondDeepestHeight = childHeight;
				  }
			  }
			  int ans = deepestHeight + secondDeepestHeight + 2;
			  if(ans>diameter)
			  {
				  diameter = ans;
			  }
			  deepestHeight +=1;
			  return deepestHeight;
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
		    // write your code here
		    diameterOfGT(root);
		    System.out.println(diameter);
		    
		  }
}
