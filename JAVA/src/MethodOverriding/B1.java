package MethodOverriding;

public class B1 extends B {
	
	
	

	@Override
	void a1() {
		System.out.println("a1 is now comes under B1 class");
		
	}

	@Override
	void a2() {
		System.out.println("a2 is now comes under B1 class");
		
	}

	public static void main(String[] args) {
		
		B1 b = new B1();
		b.a1();
		b.a2();
		

	}

}
