package DSALevel1.StackAndQueue;

import java.util.*;
/*
Why we does not use like "Queue<Integer> queue = new Queue<>();"?

Because Queue is an interface. so we can not able to make object of interface. Because in interface all the methods are just declare
not define. So, we can't able to create an object of Interface class. 
But ArrayDeque class implements Dequeue and Dequeue implements Queue interface. 
That's why Queue Class object creation syntax is possible as per below.
		Queue<Integer> queue = new ArrayDeque<>();
		
Queue => add() ---> Enqueue
Queue => remove() ---> Dequeue
*/
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new ArrayDeque<>();
		
		queue.add(10);
		System.out.println(queue);
		queue.add(20);
		System.out.println(queue);
		queue.add(30);
		System.out.println(queue);
	
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		
	
	
		
	}

}
