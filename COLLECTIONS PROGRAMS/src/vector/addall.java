package vector;
import java.util.List;
import java.util.Vector;
public class addall {
	public static void main(String[] args) {
		List l1=new Vector();
		l1.add(10);
		l1.add("Hello");
		l1.add(true);
		l1.add('A');
		l1.add(90.08);
		System.out.println("l1->"+l1);
		
		List l2=new Vector();
		l2.addAll(l1);  //copying l1 to l2
		System.out.println("l2->"+l2);
		
		List l3=new Vector();
		l3.add(999);
		l3.add('z');
		System.out.println("l3->"+l3);
		l3.addAll(0,l2);  // copying l2 to l3 at index 0 of l3
		System.out.println("l3->"+l3);

	}

}
