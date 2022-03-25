package DSALevel1.LinkedList;
//TC = O(n) 
//SC = O(n)
import java.io.BufferedReader;
import java.io.InputStreamReader;

import DSALevel1.LinkedList.AddLastInLinkedList.LinkedList;
import DSALevel1.LinkedList.AddLastInLinkedList.Node;

public class AddLastInLikedListWithoutTailNode {
	public static class Node{
		int data;
		Node next;
	}
	public static class LinkedList {
	    Node head;
	    int size;
	    Node temp;

	    void addLast(int val) {	    	
	        temp = new Node();
	    	temp.data = val;
	    	temp.next = null;
	    	if(size==0)
	    	{
	    		head = temp;
	    	}
	    	else
	    	{
	    		Node t = head;
	    		while(t.next!=null)
	    		{
	    			t = t.next;
	    		}
	    		t.next = temp;
	    	}
	    	size++;	
	    }
	}
	public static void testList(LinkedList list) {
	    for (Node temp = list.head; temp != null; temp = temp.next) {
	      System.out.println(temp.data);
	    }
	    System.out.println(list.size);

	    if (list.size > 0) {
	      System.out.println(list.temp.data);
	    } 
	  }
	  public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    LinkedList list = new LinkedList();

	    String str = br.readLine();
	    while(str.equals("quit") == false){
	      if(str.startsWith("addLast")){
	        int val = Integer.parseInt(str.split(" ")[1]);
	        list.addLast(val);
	      } 
	      str = br.readLine();
	    }

	    testList(list);
	  }

}
