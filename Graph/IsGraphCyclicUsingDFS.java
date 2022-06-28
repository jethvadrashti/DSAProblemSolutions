package Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//TC = O(V+E)
//SC = O(V)

public class IsGraphCyclicUsingDFS {
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
	      
	      boolean[] visited = new boolean[vtces];
	      boolean result = false;
	      for(int i=0;i<vtces;i++)
	      {
	    	  if(visited[i]==false)
	    	  {
	    		 boolean res = drawTree(graph,i,-1,visited);
	    		 if(res)
	    		 {
	    			result = true;
	    			 break;
	    		 }
	    		 else
	    		 {
	    			 result = false;
	    		 }
	    	  }
	      }  
	      System.out.println(result);
	   
	}
	
	public static boolean drawTree(ArrayList<Edge>[] graph,int src,int parent,boolean[] visited)
	{
		visited[src] = true;
		boolean ans = false;
		for(Edge e : graph[src])
		{
			if(visited[e.nbr]==false)
			{
				boolean ok = drawTree(graph,e.nbr,src,visited);
				if(ok)
				{
					ans = true;
					break;
				}
				else {
					continue;
				}
			}
			else
			{
				if(e.nbr != parent)
				{
					ans = true;
					break;
				}
				else
				{
					continue;
				}
			}
		}
		return ans;
		
	}
}
