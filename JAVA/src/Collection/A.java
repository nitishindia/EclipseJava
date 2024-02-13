package Collection;

import java.util.ArrayList;

public class A {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add("Raul");
		l.add(null);
		l.add(10.10);
		l.add("okay");
		
		System.out.println(l.size());
		System.out.println(l.get(2));
		System.out.println(l.contains(30));
		System.out.println(l.contains(20));
		l.clear();
		System.out.println(l.isEmpty());
		System.out.println(l.indexOf(330));
//		System.out.println(l.remove(1));
//		l.add(1,50);
//		System.out.println(l.set(1, 60));
//		System.out.println(l);
		
		

	}

}
