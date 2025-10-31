package vector;
import java.util.List;
import java.util.Vector;
public class add {
	public static void main(String[] args) {
		List l1=new Vector();
		l1.add(10);
		l1.add("Hello");
		l1.add(true);
		l1.add('A');
		l1.add(90.08);
		System.out.println(l1);
		
		l1.add(3,25.3);
		System.out.println(l1);
	}

}
