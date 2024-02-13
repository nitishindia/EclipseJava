
package Constructor;

public class Car extends Vehicle{
	
	String Cost = "15 lackhs";
	String Brand = "Inova";
	String color = "White";
	
	void Details() {
		String Cost = "2 lackhs";
		String Brand = "Pulsur";
		String color = "Black";
		System.out.println(super.Brand);
		System.out.println(super.color);
		System.out.println(super.Cost);
		System.out.println(this.Brand);
		System.out.println(this.color);
		System.out.println(this.Cost);
		System.out.println(Brand);
		System.out.println(color);
		System.out.println(Cost);
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.Details();

	}

}
