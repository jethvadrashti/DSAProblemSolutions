package Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

//TC = O(V+E)
//SC = O(V)


public class IsGraphCyclicUsingBFS {

static class Edge{
		
		int src;
		int nbr;
		int wt;
		
		Edge(int src,int nbr,int wt)
		{
			this.src = src;
			this.nbr = nbr;
			this.wt = wt;
		}
	}
    static class Pair{
    	int v;
    	String psf;
    	
    	Pair(int v,String psf)
    	{
    		this.v = v;
    		this.psf = psf;
    	}
    }
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int vertices = Integer.parseInt(br.readLine());
		int edges = Integer.parseInt(br.readLine());
		
		ArrayList<Edge>[] graph = new ArrayList[vertices];
		
		for(int i=0;i<graph.length;i++)
		{
			graph[i] = new ArrayList<>();
		}
		
		for(int i=0;i<edges;i++)
		{
			String[] parts = br.readLine().split(" ");
			int v1 = Integer.parseInt(parts[0]);
			int v2 = Integer.parseInt(parts[1]);
			int wt = Integer.parseInt(parts[2]);
			
			graph[v1].add(new Edge(v1,v2,wt));
			graph[v2].add(new Edge(v2,v1,wt));
		}
		
		boolean[] visited = new boolean[vertices];
		
		for(int i=0;i<vertices;i++)
		{
			if(visited[i]==false)
			{
				boolean ans = isCyclic(graph,i,visited);
				if(ans)
				{
					System.out.println(true);
					return;
				}
			}
		}
		System.out.println(false);
	}
	public static boolean isCyclic(ArrayList<Edge>[] graph,int src, boolean[] visited)
	{
		ArrayDeque<Pair> queue = new ArrayDeque<>();
		queue.add(new Pair(src,src+""));
		
		while(queue.size()>0)
		{
			Pair rem = queue.remove();
			
			if(visited[rem.v]==true)
			{
				return true;
			}
			
			visited[rem.v] = true;
			
			for(Edge e : graph[rem.v])
			{
				if(visited[e.nbr]==false)
				{
					boolean res = isCyclic(graph,e.nbr,visited);
					if(res)
					{
						return true;
					}
					else
					{
						continue;
					}
				}
			}
		}
		return false;
	}
}
