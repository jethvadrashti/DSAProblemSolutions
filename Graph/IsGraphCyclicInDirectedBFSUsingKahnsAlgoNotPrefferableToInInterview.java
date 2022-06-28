package Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;
/*
 * TC = O(V+E)
 * SC = O(V)
  Topological Sort :- A permutation of vertices in Directed acyclic Graph is called Topological Sort,if uv is the directed edge,then u
  must be appears before v.
  Topological sort possible => count==v => Directed Acyclic graph => false
   Topological sort impossible => count!=v => Directed Cyclic graph => true
  
 */
public class IsGraphCyclicInDirectedBFSUsingKahnsAlgoNotPrefferableToInInterview {
	
	public static boolean isCyclic(int V,ArrayList<ArrayList<Integer>> graph)
	{
		int[] topo = new int[V];
		
		ArrayDeque<Integer> q = new ArrayDeque<>();
		
		int[] indegree = new int[V];
		
		for(int i=0;i<V;i++)
		{
			for(Integer it : graph.get(i))
			{
				indegree[it]++;
			}
		}
		
		for(int i=0;i<indegree.length;i++)
		{
			if(indegree[i]==0)
			{
				q.add(i);
			}
		}
		int count = 0;
		int idx = 0;
		while(q.size()>0)
		{
			int vertex = q.poll();
			topo[idx] = vertex;
			count++;
			for(Integer e : graph.get(vertex))
			{
				indegree[e]--;
				if(indegree[e]==0)
				{
					q.add(e);
				}
			}
			idx++;
		}
		if(count==V)
		{
			return false;
		}
		return true;
	}
	 public static void main(String args[]) throws Exception 
	   {
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		      
		      ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
	    	  graph.add(0, new ArrayList<>(Arrays.asList(1)));
	    	  graph.add(1, new ArrayList<>(Arrays.asList(2)));
	    	  graph.add(2, new ArrayList<>(Arrays.asList(3,5)));
	    	  graph.add(3, new ArrayList<>(Arrays.asList(4)));
	    	  graph.add(4, new ArrayList<>());
	    	  graph.add(5, new ArrayList<>(4));
	    	  graph.add(6, new ArrayList<>(Arrays.asList(1,7)));
	    	  graph.add(7, new ArrayList<>(Arrays.asList(8)));
	    	  graph.add(8, new ArrayList<>(Arrays.asList(7)));
	    	  
		  
		     System.out.println(isCyclic(9,graph));
		     
	   }
}
