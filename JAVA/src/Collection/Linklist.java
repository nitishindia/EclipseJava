package Collection;

import java.util.LinkedList;

public class Linklist {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add(10);
		l.add(20);
		l.add("java");
		l.add("mava");
		l.add(10);
		System.out.println(l);
		
		l.remove(2);
	//	System.out.println(l);
		
		l.add(1,45);
		System.out.println(l);
		
		

	}

}
