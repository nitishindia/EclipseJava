package Class_Cast_Exeption;

import java.util.Comparator;

public class SortByName implements Comparator<Animal>{
	@Override
	public int compare(Animal x, Animal y) {
		
		return (x.name).compareTo (y.name);
		
	}
}
