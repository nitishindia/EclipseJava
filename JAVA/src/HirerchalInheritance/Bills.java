package HirerchalInheritance;

public class Bills extends Kids {
	
	int Total = 7000;
	
	void price () {
		
		System.out.println("Total price of the dress");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bills b = new Bills();
		b.display();
		System.out.println(b.Site);
		b.blue();
		System.out.println(b.Age);
		b.price();
		System.out.println(b.Total);
		

	}

}
