package vector;
import java.util.*;
public class equals {
	public static void main(String[] args) {
		List l1=new Vector();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		System.out.println(l1);
		
		List l2=new Vector();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		System.out.println(l2);
		System.out.println(l1.equals(l2));
		
		List l3=new Vector();
		l3.add(20);
		l3.add(40);
		l3.add(10);
		l3.add(30);
		System.out.println(l3);
		System.out.println(l1.equals(l3));
	}
}
