package arraylist;

import java.util.*;

public class add {
 public static void main(String[] args) {
	List l1=new ArrayList();
	l1.add(10);
	l1.add(true);
	l1.add("Hello");
	l1.add('A');
	System.out.println(l1);
	
	l1.add(2,90.87);
	System.out.println(l1);
	
}
}
