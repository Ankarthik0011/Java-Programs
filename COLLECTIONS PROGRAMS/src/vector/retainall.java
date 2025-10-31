package vector;

import java.util.*;
public class retainall {
	public static void main(String[] args) {
		List l1=new Vector();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		
		System.out.println(l1);
		
		List l2=new Vector();
		l2.add(30);
		l2.add(40);
		l2.add(50);
		l2.add(60);
		
		System.out.println(l2);
		
		l1.retainAll(l2); // retain only the common elements inside l1 by comparing with l2 and remove unique elements in l1.
		
		System.out.println(l1);
		System.out.println(l2);
	}

}

