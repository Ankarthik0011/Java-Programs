package priorityqueue;
import java.util.*;
public class peek{
	public static void main(String[] args) {
		Queue l1=new PriorityQueue();
		l1.add(70);
		l1.add(30);
		l1.add(20);
		l1.add(60);
		l1.add(10);
		System.out.println(l1);
		System.out.println(l1.peek()); // it will just return the top most element in object and such that it is the smallest among all.
		
		
		Queue l2=new PriorityQueue();
		l2.add("Z");
		l2.add("C");
		l2.add("A");
		System.out.println(l2);
		System.out.println(l2.peek());
	}
}
