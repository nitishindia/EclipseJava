package HirerchalInheritance;

public class Cloth extends Men {
	
	String Brand = "Nike";
	
	public void Buy() {
		
		System.out.println("Buy the cloths");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cloth c = new Cloth();
		c.display();
		System.out.println(c.Site);
		c.show();
		System.out.println(c.Fation);
		c.Buy();
		System.out.println(c.Brand);

	}

}
