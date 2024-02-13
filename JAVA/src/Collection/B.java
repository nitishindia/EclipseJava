package Collection;

import java.util.ArrayList;



public class B {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		l.add("java");
		l.add(10);
		l.add("mava");
		l.add("java");
		l.add(10.90);
		l.add(null);
		
		for(int i=0; i<=l.size()-1; i++) {
		System.out.println(l.get(i));
		}
		
		for (int j=l.size()-1; j>=0; j--) {
			System.out.println(l.get(j));	
		}
		
	}

}
