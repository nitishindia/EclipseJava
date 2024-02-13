package MethodOverriding;

public class C extends A{
	
	

	@Override
	void a1() {
		System.out.println("a1 comes undr C class");
		
	}

	@Override
	void a2() {
		System.out.println("a2 comes under C class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.a1();
		c.a2();

	}

}
