package HashMapAndHeap;
import java.util.*;
//TC = O(nlogn)
//SC = O(n)
public class WritePriorityQueueUsingComparable {
	
	    static class Student implements Comparable<Student>{
			int rno;
			int marks;
			
			Student(int rno,int marks)
			{
				this.rno = rno;
				this.marks = marks;
			}
			
			public int compareTo(Student o)
			{
				return this.marks - o.marks;
			}
			
			public String toString()
			{
				return "Roll No:-" + this.rno + " " + "Marks:-" + this.marks;
			}
		}
	    static class rnoComparator implements Comparator<Student>
	    {
	    	public int compare(Student s1,Student s2)
	    	{
	    		return s2.rno - s1.rno;
	    	}
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Student> pq = new PriorityQueue<>(new rnoComparator());
			
		pq.add(new Student(11,100));
		pq.add(new Student(1,1000));
		pq.add(new Student(12,800));
		pq.add(new Student(2,900));
		pq.add(new Student(4,500));
		
		while(pq.size()>0)
		{
			System.out.println(pq.peek());
			pq.remove();
		}
	
	}
}
