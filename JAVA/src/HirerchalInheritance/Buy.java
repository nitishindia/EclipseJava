package HirerchalInheritance;

public class Buy extends Amazon{
	
	String brend = "ZARA";
	String purches = "jeans";
	
	void Total() {
		
		System.out.println("Calculating the total cost");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buy b = new Buy();
		System.out.println(b.email);
		System.out.println(b.mobileNo);
		b.regiter();
		b.login();
		System.out.println(b.mans);
		System.out.println(b.age);
		b.click();
		b.search();
		System.out.println(b.brend);
		System.out.println(b.purches);
		b.toString();		

	}

}
