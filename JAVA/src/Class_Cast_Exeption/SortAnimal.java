package Class_Cast_Exeption;

import java.util.TreeSet;

public class SortAnimal {

	public static void main(String[] args) {
	
		Animal A1 = new Animal("lion");
		Animal A2 = new Animal("Tiger");
		Animal A3 = new Animal("Monkey");
		Animal A4 = new Animal("Dogs");
		
		SortByName o = new SortByName();
		TreeSet <Animal> t = new TreeSet<Animal>(o);
		t.add(A1);
		t.add(A2);
		t.add(A3);
		t.add(A4);
		
		for (Animal x:t) {
			
		System.out.println(x);
		
		}

	}

}
