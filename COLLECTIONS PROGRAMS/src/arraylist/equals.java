package arraylist;

import java.util.ArrayList;
import java.util.List;

public class equals {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		List l2=new ArrayList();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		System.out.println(l1.equals(l2)); // it compares both object's elements of same length and in same order.
		
		List l3=new ArrayList();
		l3.add(30);
		l3.add(10);
		l3.add(20);
		
		System.out.println(l1.equals(l3));
	}

}
