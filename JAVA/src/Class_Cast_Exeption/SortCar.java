package Class_Cast_Exeption;

import java.util.TreeSet;

public class SortCar {
	public static void main(String[] args) {
		
		Car c1 = new Car(1000);
		Car c2 = new Car(2000);
		Car c3 = new Car(3000);
		Car c4 = new Car(4000);
		
		TreeSet<Car> t = new TreeSet();
		t.add(c1);
		t.add(c2);
		t.add(c3);
		t.add(c4);
		
		for (Car o : t) {
			System.out.println(o);
		}
	}
}
