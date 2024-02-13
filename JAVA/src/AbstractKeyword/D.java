package AbstractKeyword;

public class D extends C{


	@Override
	void cm1() {
		System.out.println("It's comes under C Class");
		
	}

	@Override
	void cm2() {
		System.out.println("It's comes under C Class");
		
	}

	@Override
	void bm1() {
		System.out.println("It's comes under B Class");
		
	}

	@Override
	void bm2() {
		System.out.println("It's comes under B Class");
		
	}

	@Override
	void am1() {
		System.out.println("It's comes under A Class");
		
	}
	
	public static void main(String[] args) {
		A a = new D();
		a.am1();
		B b = (B)a;
		b.bm2();
		C c = (C) b;
		c.cm1();
		c.cm2();

		
		
	}

}
