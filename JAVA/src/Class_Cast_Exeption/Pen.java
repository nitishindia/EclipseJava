package Class_Cast_Exeption;

public class Pen {
	
	double cost;
	String name;
	int quantity;
	
	Pen(double cost, String name, int quantity) {
		
		this.cost=cost;
		this.name=name;
		this.quantity=quantity;
	}

	@Override
	public String toString() {
		return "Pen [cost=" + cost + ", name=" + name + ", quantity=" + quantity + "]";
	}
	
}
