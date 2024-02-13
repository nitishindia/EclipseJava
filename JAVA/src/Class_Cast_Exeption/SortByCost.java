package Class_Cast_Exeption;

import java.util.Comparator;

public class SortByCost implements Comparator<Pen> {
	
//	@Override
//	public int compare(Pen x, Pen y)
//	{
//		return (int) (x.cost-y.cost);
//	}
	
	@Override
	public int compare(Pen x, Pen y) {
		
		return (x.name).compareTo(y.name);
	}

}
