package priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class toarray {
	public static void main(String[] args) {
		Queue l1=new PriorityQueue();
		l1.add(70);
		l1.add(30);
		l1.add(20);
		l1.add(60);
		l1.add(10);
		
		System.out.println(l1);
		
		Object arr[]=l1.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
