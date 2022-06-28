package Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//TC = O(V+E) => V = Total no. of Vertices, E= Total no. of Edges
//SC = O(V) => Because recursive stack space at max O(V) =>  Total no. of Vertices present in stack at a time 



public class PrintAllPaths {
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
	public static void printAllPaths( ArrayList<Edge>[] graph,int src,int dest,String psf,boolean[] visited)
	{
		if(src==dest)
		{
			System.out.println(psf);
			return;
		}
		
		visited[src] = true;
		
		for(Edge e : graph[src])
		{
			if(visited[e.nbr]==false)
			{
				printAllPaths(graph,e.nbr,dest,psf+e.nbr,visited);
			}
		}
		visited[src] = false;
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
		printAllPaths(graph,src,dest,src+"",visited);
	}
}