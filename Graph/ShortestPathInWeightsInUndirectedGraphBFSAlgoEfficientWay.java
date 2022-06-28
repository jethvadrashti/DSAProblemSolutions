package Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//TC = O(V+E)
//SC = O(V)

public class ShortestPathInWeightsInUndirectedGraphBFSAlgoEfficientWay {
	
	static class Pair{
		int v;
		int wt;
		
		Pair(int v,int wt)
		{
			this.v = v;
			this.wt = wt;
		}
	}
	 public static void main(String[] args) throws Exception {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 
	      
	      ArrayList<ArrayList<Pair>> graph = new ArrayList<>();
	      
	      for(int i=0;i<6;i++)
	      {
	    	  graph.add(new ArrayList<Pair>());
	      }
	      graph.get(0).add(null);
	      graph.get(1).add(new Pair(2,2));
	      graph.get(1).add(new Pair(4,1));
	      
	      graph.get(2).add(new Pair(1,2));
	      graph.get(2).add(new Pair(5,5));
	      graph.get(2).add(new Pair(5,4));
	      
	      graph.get(3).add(new Pair(2,4));
	      graph.get(3).add(new Pair(4,3));
	      graph.get(3).add(new Pair(5,1));
	      
	      graph.get(4).add(new Pair(1,1));
	      graph.get(4).add(new Pair(3,3));
	      
	      graph.get(5).add(new Pair(2,5));
	      graph.get(5).add(new Pair(3,1));
	      
	      /*
	      graph.add(null);
	   	  graph.add(1, new ArrayList<>(Arrays.asList(new Pair(2,2),new Pair(4,1))));
	   	  graph.add(2, new ArrayList<>(Arrays.asList(new Pair(1,2),new Pair(5,5),new Pair(5,4))));
	   	  graph.add(3, new ArrayList<>(Arrays.asList(new Pair(2,4),new Pair(4,3),new Pair(5,1))));
	      graph.add(4, new ArrayList<>(Arrays.asList(new Pair(1,1),new Pair(3,3))));
	      graph.add(5, new ArrayList<>(Arrays.asList(new Pair(2,5),new Pair(3,1))));
   	  */
	  
	    
	     
	      int[] dest = new int[6];
	      for(int i=0;i<dest.length;i++)
	      {
	    	  dest[i] = Integer.MAX_VALUE;
	      }
	     
	      
	      int[] ans = shortestPath(graph,1,dest);
	      
	      for(int i=1;i<ans.length;i++) {
	    	  System.out.print(ans[i]+" ");
	      }
	 }
	 public static int[] shortestPath(ArrayList<ArrayList<Pair>> graph,int src,int[] dest)
	 {
		 ArrayDeque<Integer> q = new ArrayDeque<>();
		 q.add(src);
		 dest[src] = 0;
		
		 
		 while(q.size()>0)
		 {
			 int rem = q.remove();
			 int srcVal = dest[rem];
			 
			 for(Pair e : graph.get(rem))
			 {
				
					 if(srcVal+e.wt < dest[e.v])
					 {
						 dest[e.v] = srcVal +e.wt;
						 q.add(e.v);
					 }
				 
			 }
		 }
		 return dest;
	 }
}
