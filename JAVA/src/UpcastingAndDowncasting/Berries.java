package UpcastingAndDowncasting;

public class Berries extends Fruits {
	
	String Market = "Murgespallya";
	int Crossing = 2;
	
	void berri() {
		
		System.out.println("2kg berri");
	}
	void kg() {
		
		System.out.println("Total 11kg fruits");
	}

	public static void main(String[] args) {
		
		Fruits f = new Berries();  // Upcasting
		Berries b = (Berries) f;   // Downcasting (Upcasting is mandatary for Downcasting)
		
		System.out.println(b.Market);
		System.out.println(b.Crossing);
		b.kg();
		b.berri();
		System.out.println(b.Totalfruits);
		System.out.println(b.TotalPrice);
		b.Banana();
		b.apple();
		b.orenge();
		
		

	}

}
