package Class_Cast_Exeption;

public class Car implements Comparable <Car> {
	
	int Cost;
	Car (int Cost){
		this.Cost=Cost;
	}
	@Override
	public String toString() {
		return "Car [Cost=" + Cost + "]";
	}
	@Override
	public int compareTo(Car c){
		return this.Cost-c.Cost;
	}
	
}
