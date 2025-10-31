package vector;
import java.util.*;
public class containsall {
	public static void main(String[] args) {
		List l1=new Vector();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add("hello");
		System.out.println(l1);
		
		List l2=new Vector();
		l2.add(10);
		l2.add(30);
		l2.add(30);
		System.out.println(l2);
		
		System.out.println(l1.containsAll(l2));
		
	}
}
