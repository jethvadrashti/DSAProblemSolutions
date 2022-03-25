package DSALevel1.LinkedList;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RemoveAtLastInIndex {
	public static class Node{
		int data;
		Node next;
	
	}
	public static class LinkedList{
		Node head;
		Node tail;
		int size;
		
		int size()
		{
			return size;
		}
		public void addFirst(int val)
		{
			Node temp = new Node();
			temp.data = val;
			temp.next = head;
			if(size==0)
			{
				tail = temp;
			}
			head = temp;
			size++;
		}
		public void addLast(int val)
		{
			
		}
		public void addAt(int idx,int val)
		{
			
		}
		public int getFirst()
		{
			
		}
		public int getLast()
		{
			
		}
		public int getAt(int idx)
		{
			
		}
		public void removeFirst()
		{
			
		}
		public void removeLast()
		{
		
		}
		public void removeAt(int idx)
		{
			
		}
		public void display()
		{
			for(Node temp=head;temp!=null;temp = temp.next)
			{
				System.out.print(temp.data+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    LinkedList list = new LinkedList();

	    String str = br.readLine();
	    while (str.equals("quit") == false) {
	      if (str.startsWith("addLast")) {
	        int val = Integer.parseInt(str.split(" ")[1]);
	        list.addLast(val);
	      } else if (str.startsWith("size")) {
	        System.out.println(list.size());
	      } else if (str.startsWith("display")) {
	        list.display();
	      } else if (str.startsWith("removeFirst")) {
	        list.removeFirst();
	      } else if (str.startsWith("getFirst")) {
	        int val = list.getFirst();
	        if (val != -1) {
	          System.out.println(val);
	        }
	      } else if (str.startsWith("getLast")) {
	        int val = list.getLast();
	        if (val != -1) {
	          System.out.println(val);
	        }
	      } else if (str.startsWith("getAt")) {
	        int idx = Integer.parseInt(str.split(" ")[1]);
	        int val = list.getAt(idx);
	        if (val != -1) {
	          System.out.println(val);
	        }
	      } else if (str.startsWith("addFirst")) {
	        int val = Integer.parseInt(str.split(" ")[1]);
	        list.addFirst(val);
	      } else if (str.startsWith("addAt")) {
	        int idx = Integer.parseInt(str.split(" ")[1]);
	        int val = Integer.parseInt(str.split(" ")[2]);
	        list.addAt(idx, val);
	      } else if (str.startsWith("removeLast")) {
	        list.removeLast();
	      } else if (str.startsWith("removeAt")) {
	        int idx = Integer.parseInt(str.split(" ")[1]);
	        list.removeAt(idx);
	      }
	      str = br.readLine();
	    }
	  }
}
