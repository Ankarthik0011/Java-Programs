package arraylist;

import java.util.*;

public class get {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
	}

}
