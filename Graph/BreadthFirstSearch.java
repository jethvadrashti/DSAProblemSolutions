package Graph;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//TC = O(V+E) => V = Total no. of Vertices, E= Total no. of Edges
//SC = O(V) => Because recursive stack space at max O(V) =>  Total no. of Vertices present in stack at a time 
public class BreadthFirstSearch {
	static class Edge {
	      int src;
	      int nbr;
	      int wt;
	      Edge(int src, int nbr,int wt) {
	         this.src = src;
	         this.nbr = nbr;
	         this.wt = wt;
	      }
	   }
		public static class Pair{
			int val;
			String path;
			Pair(int val,String path)
			{
				this.val = val;
				this.path = path;
			}
		}
	   public static void main(String[] args) throws Exception {
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

	      // write your code here  
	      boolean[] visited = new boolean[vtces];
	     ArrayDeque<Pair> pq = new ArrayDeque<>();
	      
	      pq.add(new Pair(src,src+""));
 	      breadthFirstSearch(graph,src,visited,pq);
	   }
	   public static void breadthFirstSearch(ArrayList<Edge>[] graph,int src,boolean[] visited, ArrayDeque<Pair> pq)
	   {
		   while(pq.size()>0)
		   {
			   Pair remove = pq.remove();
			   if(visited[remove.val]==true)
			   {
				   continue;
			   }
			   visited[remove.val] = true;
			   System.out.println(remove.val+"@"+remove.path);
			   
			   for(Edge e : graph[remove.val])
			   {
				   if(visited[e.nbr]==false)
				   {
					   pq.add(new Pair(e.nbr,remove.path+e.nbr));
				   }
			   }
			   
		   }
	   }
}
