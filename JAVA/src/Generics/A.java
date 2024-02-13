package Generics;

import java.util.ArrayList;

public class A {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList();
		l.add(10);
		l.add(50);
		l.add(30);
		l.add(40);
		System.out.println(l);
		for(Object a:l) {
			System.out.println(a);
		}

	}

}
