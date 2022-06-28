package Graph;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//TC = O(V+E)
//SC = O(V) Auxiliary space
// Not possible to solve using DFS.
public class SpreadInfectionUsingBFS {
	 static class Edge {
	      int src;
	      int nbr;

	      Edge(int src, int nbr) {
	         this.src = src;
	         this.nbr = nbr;
	      }
	   }
	 	static class Pair{
	 		int val;
	 		int time;
	 		
	 		Pair(int val,int time)
	 		{
	 			this.val = val;
	 			this.time = time;
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
	         graph[v2].add(new Edge(v2, v1));
	      }

	      int src = Integer.parseInt(br.readLine());
	      int t = Integer.parseInt(br.readLine());
	      
	      // write your code here
	      
	      int[] visited = new int[vtces];
	      
	      int ans = spreadInfection(graph,src,t,visited);
	      
	      System.out.println(ans);
	   }
	   
	   public static int spreadInfection(ArrayList<Edge>[] graph,int src,int t,int[] visited)
	   {
		   ArrayDeque<Pair> queue = new ArrayDeque<>();
		   queue.add(new Pair(src,1));
		   int count = 0;
		   while(queue.size()>0)
		   {
			   Pair rem = queue.remove();
			   
			   if(visited[rem.val]!=0)
			   {
				   continue;
			   }
			   visited[rem.val] = rem.time;
			   
			   if(rem.time>t)
			   {
				   break;
			   }
			   count++;
			   
			   for(Edge e: graph[rem.val])
			   {
				   if(visited[e.nbr]==0)
				   {
					   queue.add(new Pair(e.nbr,rem.time+1));
				   }
			   }
		   }
		   return count;
		   
	   }

}
