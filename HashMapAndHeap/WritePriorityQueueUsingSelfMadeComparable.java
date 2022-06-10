package HashMapAndHeap;
import java.util.*;
import HashMapAndHeap.WritePriorityQueueUsingComparable.Student;
//TC = O(nlogn)
//SC = O(n)
public class WritePriorityQueueUsingSelfMadeComparable {

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
	    		return s1.rno - s2.rno;
	    	}
	    }
	public static class PriorityQueue<T>
	{
		ArrayList<T> data;
		 Comparator comp;
		 PriorityQueue(Comparator comp)
		 {
			 data = new ArrayList<>();
			 this.comp = comp;
		 }
		 PriorityQueue()
		 {
			 data = new ArrayList<>();
			 comp = null;
		 }
		 public void add(T val)
		 {
			 data.add(val);
			 upheapify(data.size()-1);
		 }
		 public void upheapify(int i)
		 {
			 if(i==0)
			 {
				 return;
			 }
			 
			 int pi = (i - 1)/2;
			 if(isSmaller(i,pi))
			 {
				 swap(i,pi);
				 upheapify(pi);
			 }
		 }
		 public boolean isSmaller(int i,int j)
		 {
			 if(comp==null)
			 {
				 Comparable ith = (Comparable) data.get(i);
				 Comparable jth = (Comparable) data.get(j);
				 
				 if(ith.compareTo(jth)<0)
				 {
					 return true;
				 }
				 else
				 {
					 return false;
				 }
			 }
			 else
			 {
				 T ith =  data.get(i);
				 T jth =  data.get(j);
				 
				 if(comp.compare(ith,jth)<0)
				 {
					 return true;
				 }
				 else
				 {
					 return false;
				 }
			 }
			 
		 }
		 public int size()
		 {
			 return data.size();
		 }
		 public void swap(int i,int j)
		 {
			 T temp = data.get(i);
			 data.set(i, data.get(j));
			 data.set(j, temp);
		 }
		 public T remove()
			{
			  if(this.size()==0)
		      {
		        System.out.println("Underflow");
		        return null;
		      }
				swap(0,data.size()-1);
		
				T val = data.remove(data.size()-1);
						
				downheapify(0);
				
				return val;
			}
			public T peek()
			{
			  if(this.size()==0)
		      {
		        System.out.println("Underflow");
		        return null;
		      }
				
				return data.get(0);
			}
		 public void downheapify(int i)
		 {
				int min = i;
				
				int left = 2*i + 1;
				int right = 2 *i + 2;
				
				if(left<data.size() && isSmaller(left,min))
				{
					min = left;
				}
				if(right<data.size() && isSmaller(right,min))
				{
					min = right;
				}
				
				if(min!=i)
				{
					swap(min,i);
					downheapify(min);
				}
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
