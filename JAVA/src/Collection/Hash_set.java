package Collection;

import java.util.HashSet;

public class Hash_set {

	public static void main(String[] args) {
		 
		HashSet h = new HashSet();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(50);
		h.add(60);
		h.add(70);
		h.add(80);
		h.add(90);
		h.add(100);
		h.add(110);
		h.add(120);
		h.add(130);
		h.add(140);
		h.add("java");
		h.add(null);  // null value only once
		h.add(null);
		h.add("java"); // duplicate not allow
		//System.out.println(h);
		
		for (Object x:h) {		// for each loop
			System.out.println(x);
		}
	}

}
