package Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

//TC = O(V+E)
//SC = O(2V) => Two arrays will required space
//Auxiliary => O(V)
public class IsGraphCyclicInDirectedDFS {
	
	 public static boolean isGraphCyclic(ArrayList<ArrayList<Integer>> adj,int src,boolean[] visited,boolean[] dfsvisited)
		{
			visited[src] = true;
			dfsvisited[src]  = true;
			
			for(Integer iit : adj.get(src))
			{
				if(visited[iit]==false)
				{
					boolean ans = isGraphCyclic(adj,iit,visited,dfsvisited);
					if(ans)
					{
						return true;
					}
				}
				else if(dfsvisited[iit]==true)
				{
					return true;
				}
			}
			dfsvisited[src] = false;
			
			return false;
		}
	    public static void isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
	        // code here
	          boolean[] visited = new boolean[V];
		      
		      boolean[] dfsvisited = new boolean[V];
		      
		      for(int i=0;i<V;i++)
		      {
		    	  if(visited[i]==false)
		    	  {
		    		  boolean res = isGraphCyclic(adj,i,visited,dfsvisited);
		    		  if(res)
		    		  {
		    			 System.out.println(true);
		    			 return;
		    		  }
		    	  }
		      }
		      System.out.println(false);
	    }
	   public static void main(String args[]) throws Exception 
	   {
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
	    	  
		  
		     isCyclic(9,graph);
	   }
	
}
