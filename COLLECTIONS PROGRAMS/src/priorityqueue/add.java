package priorityqueue;
import java.util.*;
public class add {
	public static void main(String[] args) {
		Queue l1=new PriorityQueue();
		l1.add(10);
		l1.add(90);
		System.out.println(l1);
		l1.add(40);
		System.out.println(l1);
		l1.add(5);
		System.out.println(l1);
		l1.add(70);
		System.out.println(l1);
		l1.add(30);
		System.out.println(l1); // aim of priority queue is to sort (Partially or fully) such that the top most element must be a lesser than all among the elements in that object.
		
		
		Queue l2=new PriorityQueue();
		l2.add("Z");
		l2.add("C");
		l2.add("A");
		System.out.println(l2);
	}
}
