package arraylist;

import java.util.*;

public class isempty {
	public static void main(String[] args) {
		List l1=new ArrayList();
		System.out.println(l1.isEmpty());// returns true or false based on list is empty or not
		System.out.println(l1);
		l1.add(10);
		l1.add(20);
		l1.add(30);
		System.out.println(l1.isEmpty());
		System.out.println(l1);
	}

}
