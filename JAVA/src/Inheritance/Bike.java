package Inheritance;

public class Bike extends Vehical {
	
	String Type = "honda";
	int price = 150000;
	
	public void twoVilar() {
		
		System.out.println("Bike is twovilar");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike();
		System.out.println(b.Type);
		System.out.println(b.price);
		b.twoVilar();
		System.out.println(b.Car);
		System.out.println(b.Cost);
		b.look();

	}

}
