package Class_Cast_Exeption;

public class Emp implements Comparable<Emp> {
	
	double sal;
	
	Emp(double sal){
		this.sal = sal;
		}

	@Override
	public String toString() {
		return "Emp [sal=" + sal + "]";
	}
	@Override
	public int compareTo(Emp e)
	{
		return (int)(this.sal-e.sal);
	}
	
}
