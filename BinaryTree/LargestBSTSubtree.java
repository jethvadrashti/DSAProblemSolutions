package BinaryTree;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//TC = O(n)
//SC = O(n) if we consider stack space.
public class LargestBSTSubtree {
	public static class Node {
	    int data;
	    Node left;
	    Node right;

	    Node(int data, Node left, Node right) {
	      this.data = data;
	      this.left = left;
	      this.right = right;
	    }
	  }

	  public static class Pair {
	    Node node;
	    int state;

	    Pair(Node node, int state) {
	      this.node = node;
	      this.state = state;
	    }
	  }

	  public static Node construct(Integer[] arr) {
	    Node root = new Node(arr[0], null, null);
	    Pair rtp = new Pair(root, 1);

	    Stack<Pair> st = new Stack<>();
	    st.push(rtp);

	    int idx = 0;
	    while (st.size() > 0) {
	      Pair top = st.peek();
	      if (top.state == 1) {
	        idx++;
	        if (arr[idx] != null) {
	          top.node.left = new Node(arr[idx], null, null);
	          Pair lp = new Pair(top.node.left, 1);
	          st.push(lp);
	        } else {
	          top.node.left = null;
	        }

	        top.state++;
	      } else if (top.state == 2) {
	        idx++;
	        if (arr[idx] != null) {
	          top.node.right = new Node(arr[idx], null, null);
	          Pair rp = new Pair(top.node.right, 1);
	          st.push(rp);
	        } else {
	          top.node.right = null;
	        }

	        top.state++;
	      } else {
	        st.pop();
	      }
	    }

	    return root;
	  }
	  public static class LarBST{

	    boolean isbst;
	    int min;
	    int max;
	    Node larsubtN;
	    int larsubtS;
	  }
	  public static LarBST largeBST(Node node){

	      if(node==null)
	      {
	        LarBST bp = new LarBST();
	        bp.isbst = true;
	        bp.min = Integer.MAX_VALUE;
	        bp.max = Integer.MIN_VALUE;
	        bp.larsubtN = null;
	        bp.larsubtS = 0;
	        return bp;
	      }

	      LarBST lst = largeBST(node.left);
	      LarBST rst = largeBST(node.right);

	      LarBST rtst = new LarBST();
	      rtst.isbst = lst.isbst && rst.isbst && 
	                   (node.data>=lst.max && node.data<=rst.min);
	      rtst.min = Math.min(node.data,Math.min(lst.min,rst.min));
	      rtst.max = Math.max(node.data,Math.max(lst.max,rst.max));
	      if(rtst.isbst)
	      {
	        rtst.larsubtN = node;
	        rtst.larsubtS = lst.larsubtS + rst.larsubtS + 1;
	      }
	      else if(lst.larsubtS > rst.larsubtS)
	      {
	        rtst.larsubtN = lst.larsubtN;
	        rtst.larsubtS = lst.larsubtS;
	      }
	      else{
	        rtst.larsubtN = rst.larsubtN;
	        rtst.larsubtS = rst.larsubtS;
	      }
	      return rtst;
	  }
	  public static void display(Node node) {
	    if (node == null) {
	      return;
	    }

	    String str = "";
	    str += node.left == null ? "." : node.left.data + "";
	    str += " <- " + node.data + " -> ";
	    str += node.right == null ? "." : node.right.data + "";
	    System.out.println(str);

	    display(node.left);
	    display(node.right);
	  }
	  
	  public static void main(String[] args) throws Exception {
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
	    
	    // write your code here
	    

	    LarBST ans = largeBST(root);
	    System.out.println(ans.larsubtN.data +"@" + ans.larsubtS);
	  }
}
