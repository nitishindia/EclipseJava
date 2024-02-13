package Class_Cast_Exeption;

import java.util.TreeSet;

public class SortEmp {

	public static void main(String[] args) {
		
		Emp s1 = new Emp(1000);
		Emp s2 = new Emp(2000);
		Emp s3 = new Emp(3000);
		Emp s4 = new Emp(4000);
		
		TreeSet<Emp> t = new TreeSet();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		
		for (Emp o:t) {
			System.out.println(o);
		}
				
		

	}

}
