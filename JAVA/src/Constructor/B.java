package Constructor;

public class B extends A {
	
	int a=20;
	
	void add () {
		
		int a=30;
		System.out.println(a);
		System.out.println(this.a); // Use this() to call the global veriable of B class.
		System.out.println(super.a);// Use super() to call the global veriable of A class.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.add();
		
		
		

	}

}
