package Graph;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//TC = O(V+E)
//SC = O(V)
public class OrderOfCompilation {
	 static class Edge {
	      int src;
	      int nbr;

	      Edge(int src, int nbr) {
	         this.src = src;
	         this.nbr = nbr;
	      }
	   }

	   public static void main(String[] args) throws Exception {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	      int vtces = Integer.parseInt(br.readLine());
	      ArrayList<Edge>[] graph = new ArrayList[vtces];
	      for (int i = 0; i < vtces; i++) {
	         graph[i] = new ArrayList<>();
	      }

	      int edges = Integer.parseInt(br.readLine());
	      for (int i = 0; i < edges; i++) {
	         String[] parts = br.readLine().split(" ");
	         int v1 = Integer.parseInt(parts[0]);
	         int v2 = Integer.parseInt(parts[1]);
	         graph[v1].add(new Edge(v1, v2));
	      }

	      // write your code here
	      Stack<Integer> ans = new Stack<>();
	      boolean[] visited = new boolean[vtces];
	      for(int i=0;i<vtces;i++)
	      {
	         if(visited[i]==false)
	         {
	            orderOfCompilation(graph,i,visited,ans);
	         }
	      }
	      while(ans.size()>0)
	      {
	         System.out.println(ans.pop());
	      }
	   }
	   public static void orderOfCompilation(ArrayList<Edge>[] graph,int src,boolean[] visited,Stack<Integer> ans)
	   {

	      visited[src] = true;

	      for(Edge e : graph[src])
	      {
	         if(visited[e.nbr]==false)
	         {
	            orderOfCompilation(graph,e.nbr,visited,ans);
	         }
	      }
	      ans.push(src);
	   }

	
}
