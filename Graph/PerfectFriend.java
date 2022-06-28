package Graph;
//TC = O(V+E) => V = Total no. of Vertices, E= Total no. of Edges
//SC = O(V) => Because recursive stack space at max O(V) =>  Total no. of Vertices present in stack at a time
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class PerfectFriend {

	static class Edge{
		int src;
		int nbr;
		
		Edge(int src,int nbr)
		{
			this.src = src;
			this.nbr = nbr;
		}
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int vertices = Integer.parseInt(br.readLine());
		int edges = Integer.parseInt(br.readLine());
		
		ArrayList<Edge>[] graph = new ArrayList[vertices];
		
		for(int i=0;i<vertices;i++)
		{
			graph[i] = new ArrayList<>();
		}
		for(int i=0;i<edges;i++)
		{
			String[] parts = br.readLine().split(" ");
			int v1 = Integer.parseInt(parts[0]);
			int v2 = Integer.parseInt(parts[1]);
			
			graph[v1].add(new Edge(v1,v2));
			graph[v2].add(new Edge(v2,v1));
			
		}
			
		ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
		
		boolean[] visited = new boolean[vertices];
		for(int i=0;i<vertices;i++)
		{
			if(visited[i]==false)
			{
				ArrayList<Integer> comp = new ArrayList<>();
				drawTreeAndCreateComp(graph,i,visited,comp);
				comps.add(comp);
			}
		}
		int count = 0;
		for(int i=0;i<comps.size();i++)
		{
			for(int j=i+1;j<comps.size();j++)
			{
				count += comps.get(i).size() * comps.get(j).size();
			}
		}
		System.out.println(count);
	}
	public static void drawTreeAndCreateComp(ArrayList<Edge>[] graph,int src,boolean[] visited,ArrayList<Integer> comp)
	{
		visited[src] = true;
		comp.add(src);
		
		for(Edge e : graph[src])
		{
			if(visited[e.nbr]==false)
			{
				drawTreeAndCreateComp(graph,e.nbr,visited,comp);
			}
		}
	}

}
