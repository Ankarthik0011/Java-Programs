package priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class addall {
	public static void main(String[] args) {
		Queue l1=new PriorityQueue();
		l1.add(40);
		l1.add(20);
		l1.add(10);
		l1.add(30);
		System.out.println("l1->"+l1);
		
		Queue l2=new PriorityQueue();
		l2.add(90);
		System.out.println(l2);
		
		l2.addAll(l1);
		System.out.println(l2);
	}
}
