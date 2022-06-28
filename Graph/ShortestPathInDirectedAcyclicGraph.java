package Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

//TC = O((V+E)*2)
//SC = O(2V)

public class ShortestPathInDirectedAcyclicGraph {

	static class Pair{
		int v;
		int wt;
		
		Pair(int v,int wt)
		{
			this.v = v;
			this.wt = wt;
		}
	}
	 public static void main(String[] args) throws Exception {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 
	      
	      ArrayList<ArrayList<Pair>> graph = new ArrayList<>();
	      
	      for(int i=0;i<6;i++)
	      {
	    	  graph.add(new ArrayList<Pair>());
	      }
	      
	      graph.get(0).add(new Pair(1,2));
	      graph.get(0).add(new Pair(4,1));
	      
	      graph.get(1).add(new Pair(2,3));
	      
	      graph.get(2).add(new Pair(3,6));
	  
	      
	      graph.get(4).add(new Pair(2,2));
	      graph.get(4).add(new Pair(5,4));
	      
	      graph.get(5).add(new Pair(3,1));
	      
	      int[] ans = shorestPath(graph,6,0);
	      
	      for(int i=0;i<ans.length;i++)
	      {
	    	  System.out.print(ans[i]+" ");
	      }
	 }
	 public static void topologicalSort(ArrayList<ArrayList<Pair>> graph,int src,boolean[] visited,Stack<Integer> st)
	 {
		 visited[src] = true;
		 
		 for(Pair e : graph.get(src))
		 {
			 if(visited[e.v]==false)
			 {
				 topologicalSort(graph,e.v,visited,st);
			 }
		 }
		 st.add(src);
	 }
	 public static int[] shorestPath(ArrayList<ArrayList<Pair>> graph,int vtces,int src)
	 {
		 boolean[] visited = new boolean[vtces];
		 
		 Stack<Integer> st = new Stack<>();
		 st.add(src);
		 for(int i=0;i<vtces;i++)
		 {
			 if(visited[i]==false)
			 {
				 topologicalSort(graph,i,visited,st);
			 }
		 }
		 
		 int[] dest = new int[vtces];
		
		 for(int i=0;i<vtces;i++)
		 {
			 dest[i] = Integer.MAX_VALUE;
		 } 
		 dest[src] = 0;
		 while(st.size()>0)
		 {
			 int rem = st.pop();
			 
			 int srcVal = dest[rem];
			 
			 if(srcVal!=Integer.MAX_VALUE)
			 {
				 for(Pair e : graph.get(rem))
				 {
					 if(srcVal+e.wt<dest[e.v])
					 {
						 dest[e.v] = srcVal + e.wt;
					 }
				 }
			 }
		 }
		 
		 return dest;
		 
	 }
}
