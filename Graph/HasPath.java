package Graph;
import java.io.BufferedReader;
import java.io.*;
import java.util.*;
//TC = O(V+E) => V = Total no. of Vertices, E= Total no. of Edges
//SC = O(V) => Because recursive stack space at max O(V) =>  Total no. of Vertices present in stack at a time 

public class HasPath {

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
	public static boolean hasPath(ArrayList<Edge>[] graph,int src,int dest,boolean[] visited)
	{
		if(src==dest)
		{
			return true;
		}
		visited[src] = true;
		for(Edge edge : graph[src])
		{
			if(visited[edge.nbr]==false)
			{
				boolean nbrhaspath = hasPath(graph,edge.nbr,dest,visited);
				if(nbrhaspath==true)
				{
					return true;
				}
			}
		}
		return false;
		
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

	      int src = Integer.parseInt(br.readLine());
	      int dest = Integer.parseInt(br.readLine());

		boolean[] visited = new boolean[vtces];
		boolean ans = hasPath(graph,src,dest,visited);
		System.out.println(ans);
	}

}
