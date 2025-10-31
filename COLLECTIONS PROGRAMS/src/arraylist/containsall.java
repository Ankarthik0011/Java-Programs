package arraylist;

import java.util.ArrayList;

public class containsall {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		
		System.out.println(l1);
		
		ArrayList l2=new ArrayList();
		l2.add(10);
		l2.add(40);
		l2.add(20);
		l2.add(30);
		
		
		
		System.out.println(l2);
		
		System.out.println(l1.containsAll(l2));  // checka whether l1 object contains all elements that all present in l2 and order does not matter here.
		
	}
}
