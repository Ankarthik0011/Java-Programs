package vector;


import java.util.*;
public class isempty {

	public static void main(String[] args) {
		List l1=new Vector();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		System.out.println(l1);
		System.out.println(l1.isEmpty());
		l1.clear();
		System.out.println(l1);
		System.out.println(l1.isEmpty());
	}

}

