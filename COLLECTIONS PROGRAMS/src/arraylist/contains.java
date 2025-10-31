package arraylist;

import java.util.ArrayList;

public class contains {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		
		System.out.println(l1);
		
		System.out.println(l1.contains(10));
		System.out.println(l1.contains(50));
	}
}
