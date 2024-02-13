package Collection;

import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		t.add(30);
		t.add(40);
		t.add(20);
		t.add(50);
		t.add(10);
		t.add(30);
	//	System.out.println(t);
		
		for (Object x:t) {      // for each loop
			System.out.println(x);
		}
	}

}
