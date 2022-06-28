package Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
//TC = O(V+E)
//SC = O(V)
import Graph.IsGraphBipartiteUsingBFS.Edge;

public class IsGraphBipartiteUsingDFS {
	public static class Edge{
		int src;
		int nbr;
		int wt;
		
		Edge(int src,int nbr, int wt)
		{
			this.src = src;
			this.nbr = nbr;
			this.wt = wt;
		}
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	      int vtces = Integer.parseInt(br.readLine());
	      ArrayList<Edge>[] graph = new ArrayList[vtces];
	      for(int i = 0; i < vtces; i++){
	         graph[i] = new ArrayList<>();
	      }

	      int edges = Integer.parseInt(br.readLine());
	      for(int i = 0; i < edges; i++){
	         String[] parts = br.readLine().split(" ");
	         int v1 = Integer.parseInt(parts[0]);
	         int v2 = Integer.parseInt(parts[1]);
	         int wt = Integer.parseInt(parts[2]);
	         graph[v1].add(new Edge(v1, v2, wt));
	         graph[v2].add(new Edge(v2, v1, wt));
	        
	      }
	      
	      int[] visited = new int[vtces];
	      
	      for(int i=0;i<vtces;i++)
	      {
	    	  if(visited[i]==0)
	    	  {
	    		  boolean ans = isBipartite(graph,i,visited,1);
	    		  if(!ans)
	    		  {
	    			  System.out.println(false);
	    			  return;
	    		  }
	    	  }
	      }
	      System.out.println(true);
	      
	}
	public static boolean isBipartite(ArrayList<Edge>[] graph,int src,int[] visited,int level)
	{
		visited[src] = level;
		
		for(Edge e : graph[src])
		{
			if(visited[e.nbr]==0)
			{
				boolean ans = isBipartite(graph,e.nbr,visited,-level);
				if(!ans)
				{
					return false;
				}
			}
			else
			{
				if(visited[src]==visited[e.nbr])
				{
					return false;
				}
			}
		}
		return true;
	}
}
