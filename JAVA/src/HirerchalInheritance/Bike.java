package HirerchalInheritance;

public class Bike extends Vehical {
	
	String Brand = "kawasaki";
	String price = "10lack";
	
	public void wish () {
		
		System.out.println("Wish to buy kawasaki");
	}
	
	public static void main(String[] args) {
		
		Bike b = new Bike();
		
		b.display();
		System.out.println(b.BrandOfCar);
		System.out.println(b.Cost);
		b.wish();
		System.out.println(b.Brand);
		System.out.println(b.price);
		
		
	}

}
