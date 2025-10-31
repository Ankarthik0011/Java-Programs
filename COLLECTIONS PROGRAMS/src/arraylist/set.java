package arraylist;

import java.util.*;

public class set {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		System.out.println(l1);
		
		l1.set(1,"Hello"); // will replace the new element with old element by deleting old and placing new in it's place.
		System.out.println(l1);
	}

}
