package DSALevel1.LinkedList;

import java.util.LinkedList;
//TC = O(1) for all the Method of all,remove and get in LinkedList.
//SC = O(1) for all the Method of all,remove and get in LinkedList.
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(100);
		System.out.println("List" + " --> " +list);
		
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(10);
		list2.add(20);
		list2.add(100);
		list2.addFirst(30);
		System.out.println("List 2" + " --> " +list2);
		
		list.addLast(50);
		System.out.println("List" + " --> " +list);
		
		list.add(2, 40);
		System.out.println("List" + " --> " +list);
		
		list.addAll(1, list2);
		System.out.println("List" + " --> " +list);
		
		list.addAll(list2);
		System.out.println("List" + " --> " +list);
		
		LinkedList<Integer> list3 = new LinkedList<>();
		list3.addAll(list2);
		System.out.println("List3" + " --> " +list3);
		
		list3.remove();//Remove Function help to remove 0th index element only.
		System.out.println("List3" + " --> " +list3);
		
		list3.removeFirst();//Remove Function help to remove 0th index element only.
		System.out.println("List3" + " --> " +list3);
		
		list3.removeLast();
		System.out.println("List3" + " ---->" + list3);
		
		list3.addAll(list);
		System.out.println("List3" + " ----->" + list3);
		
		list3.removeFirstOccurrence(20);
		System.out.println("List3" + " ----->" + list3);
		
		list3.removeLastOccurrence(100);
		System.out.println("List3" + " ----->" + list3);
		
		list3.remove(list);
		System.out.println("List3" + " ----->" + list3);
		
		
		//list3.get(4);
		System.out.println("List3" + " ----->" + list3.get(4));
		
		//list3.getFirst();
		System.out.println("List3" + " ----->" + list3.getFirst());
		
		//list3.getLast();
		System.out.println("List3" + " ----->" + list3.getLast());
		
		System.out.println(list.getClass());
	}

}
