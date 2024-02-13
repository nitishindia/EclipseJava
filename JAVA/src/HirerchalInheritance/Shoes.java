package HirerchalInheritance;

public class Shoes extends Men {
	
	int price = 1500;
	
	public void campus () {
		
		System.out.println("Campus shoes price is Rs-");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shoes s = new Shoes();
		
		s.display();
		System.out.println(s.Site);
		s.show();
		System.out.println(s.Fation);
		s.campus();
		System.out.println(s.price);

	}

}
