package Class_Cast_Exeption;

import java.util.TreeSet;

public class SortPen {

	public static void main(String[] args) {
		
		Pen p1 = new Pen(10.10, "cell", 5);
		Pen p2 = new Pen(20.20, "Apsare", 6);
		Pen p3 = new Pen(30.30, "QT", 2);
		Pen p4 = new Pen(40.40, "Agni", 4);
		
		SortByCost s = new SortByCost();
		TreeSet<Pen> t = new TreeSet<Pen>(s);
		t.add(p1);
		t.add(p2);
		t.add(p3);
		t.add(p4);
		
	for (Pen obj:t) {
		System.out.println(obj);
	}	
	
	}

}
