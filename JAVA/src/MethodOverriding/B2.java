package MethodOverriding;

public class B2 extends B{
	
	

	@Override
	void a1() {
		System.out.println("a1 is now comes under B2 class");
	}

	@Override
	void a2() {
		System.out.println("a1 is now comes under B2 class");
	}

	public static void main(String[] args) {
		B2 b = new B2();
		b.a1();
		b.a2();

	}

}
