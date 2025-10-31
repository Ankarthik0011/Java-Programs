package arraylist;

import java.util.ArrayList;

public class remove {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(4);
		l1.add(3);
		l1.add(2);
		l1.add(1);
		System.out.println(l1);
		System.out.println(l1.remove(3)); // if the parameter is to int , then by default the it considers remove (int index)
		System.out.println(l1);
		
		ArrayList l2=new ArrayList();
		l2.add("A");
		l2.add("B");
		l2.add("C");
		l2.add("D");
		
		System.out.println(l2);
		System.out.println(l2.remove(2)); // remove(int index)
		System.out.println(l2);
		
		
		System.out.println(l2.remove("D")); // remove(object obj)
		System.out.println(l2);
	}
}
