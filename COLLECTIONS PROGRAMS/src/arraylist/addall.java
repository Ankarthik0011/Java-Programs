package arraylist;

import java.util.ArrayList;

public class addall {
 public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add(true);
	l1.add("Hello");
	l1.add('A');
	System.out.println(l1);
	
	ArrayList l2=new ArrayList();
	System.out.println(l2);
	
	l2.addAll(l1); // Copying l1 to l2
	
	System.out.println(l1);
	System.out.println(l2);
	
	
	ArrayList l3=new ArrayList();
	l3.add(10);
	l3.add(20);
	l3.add(30);
	l3.add(40);
	System.out.println(l3);
	
	l2.addAll(2,l3); // Copying l3 to l2 of index 2
	
	System.out.println(l2);
	System.out.println(l3);
	
	
}
}
