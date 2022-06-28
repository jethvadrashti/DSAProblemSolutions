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
 */


public class TopologicalSortUsingBFSKahnsAlgorithm {
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	      
	      ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	
  	  graph.add(0, new ArrayList<>(Arrays.asList(1)));
  	  graph.add(1, new ArrayList<>(Arrays.asList(2)));
  	  graph.add(2, new ArrayList<>(Arrays.asList(3,5)));
  	  graph.add(3, new ArrayList<>(Arrays.asList(4)));
  	  graph.add(4, new ArrayList<>());
  	  graph.add(5, new ArrayList<>(4));
  	  graph.add(6, new ArrayList<>(Arrays.asList(1,7,8)));
  	  graph.add(7, new ArrayList<>(Arrays.asList(8)));
  	  graph.add(8, new ArrayList<>());
	      
	      int[] ans = topologicalSort(graph,9);
	      for(int v : ans)
	      {
	    	  System.out.print(v+" ");
	      }
	}
	public static int[] topologicalSort(ArrayList<ArrayList<Integer>> graph,int V)
	{
		int[] topo = new int[V];
		
		int[] indegree = new int[V];
		
		for(int i=0;i<V;i++)
		{
			for(Integer it : graph.get(i))
			{
				indegree[it]++;
			}
		}
		
		ArrayDeque<Integer> q = new ArrayDeque<>();
		
		for(int i=0;i<indegree.length;i++)
		{
			if(indegree[i]==0)
			{
				q.add(i);
			}
		}
		int idx = 0;
		while(q.size()>0)
		{
			int vertex = q.poll();
			
			topo[idx] = vertex;
			
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
		
		return topo;
	}
}
