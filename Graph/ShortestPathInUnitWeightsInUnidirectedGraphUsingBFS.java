package Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//TC = O(V+E)
//SC = O(V)

public class ShortestPathInUnitWeightsInUnidirectedGraphUsingBFS {
	
	
	
	 public static void main(String[] args) throws Exception {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 
	      
	      ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	      
	  graph.add(0, new ArrayList<>(Arrays.asList(1,3)));
      graph.add(1, new ArrayList<>(Arrays.asList(0,2,3)));
   	  graph.add(2, new ArrayList<>(Arrays.asList(1,6)));
   	  graph.add(3, new ArrayList<>(Arrays.asList(0,4)));
   	  graph.add(4, new ArrayList<>(Arrays.asList(3,5)));
   	  graph.add(5, new ArrayList<>(Arrays.asList(4,6)));
   	  graph.add(6, new ArrayList<>(Arrays.asList(2,5,7,8)));
   	  graph.add(7, new ArrayList<>(Arrays.asList(6,8)));
   	  graph.add(8, new ArrayList<>(Arrays.asList(6,7)));
   	  
	  
	    
	     
	      int[] dest = new int[9];
	      for(int i=0;i<dest.length;i++)
	      {
	    	  dest[i] = Integer.MAX_VALUE;
	      }
	     
	      
	      int[] ans = shortestPath(graph,0,dest);
	      
	      for(int i=0;i<ans.length;i++) {
	    	  System.out.print(ans[i]+" ");
	      }
	 }
	 public static int[] shortestPath(ArrayList<ArrayList<Integer>> graph,int src,int[] dest)
	 {
		 ArrayDeque<Integer> q = new ArrayDeque<>();
		 q.add(src);
		 dest[src] = 0;
		
		 
		 while(q.size()>0)
		 {
			 int rem = q.remove();
			 int srcVal = dest[rem];
			 
			 for(Integer e : graph.get(rem))
			 {
				
					 if(srcVal+1 < dest[e])
					 {
						 dest[e] = srcVal +1;
						 q.add(e);
					 }
				 
			 }
		 }
		 return dest;
	 }
}
