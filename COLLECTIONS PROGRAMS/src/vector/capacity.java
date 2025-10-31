package vector;

import java.util.*;

public class capacity {
	public static void main(String[] args) {
		Vector l1=new Vector(4);/// a size will be passed to initialize object capacity with user requirement , if not given default will be size 10 
		System.out.println(l1.capacity());
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		System.out.println(l1.capacity());
		l1.add(50);    //  here the size/capacity directly gets doubled or increases by 100% of its initial
		System.out.println(l1.capacity());
		l1.add(10);
		l1.add(20);
		l1.add(30);
		System.out.println(l1.capacity());
		l1.add(90);		//  here the size/capacity directly gets doubled or increases by 100% of its initial
		System.out.println(l1.capacity());
	}
}