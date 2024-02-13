package HirerchalInheritance;

public class Flipkart extends Ecommerce {

	String website = "WWW.Flipkart.com";
	String App = "Flipkart";
	
	void use () {
		System.out.println("Using for shoaping");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flipkart f = new Flipkart();
		System.out.println(f.email);
		System.out.println(f.mobileNo);
		f.regiter();
		f.login();
		System.out.println(f.website);
		System.out.println(f.App);
		f.use();

	}

}
