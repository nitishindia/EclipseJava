package Interface;

public class G implements A,B,C,D,E,F {


	@Override
	public void f1() {
		System.out.println("Comes under F Class");
		
	}

	@Override
	public void f2() {
		System.out.println("Comes under F Class");
		
	}

	@Override
	public void f3() {
		System.out.println("Comes under F Class");
		
	}

	@Override
	public void e1() {
		System.out.println("Comes under E Class");
		
	}

	@Override
	public void e2() {
		System.out.println("Comes under E Class");
		
	}

	@Override
	public void d1() {
		System.out.println("Comes under D Class");
		
	}

	@Override
	public void c1() {
		System.out.println("Comes under C Class");
		
	}

	@Override
	public void b1() {
		System.out.println("Comes under B Class");
		
	}

	@Override
	public void a1() {
		System.out.println("Comes under A Class");
		
	}


		public static void main (String [] args) {
			
			//A a = new G();
			//a.a1();
			B b = new G();
			b.a1();
			b.b1();
			F f = new G();
			f.a1();
			f.b1();
			f.c1();
			f.d1();
			f.e1();
			f.e2();
			f.f1();
			f.f2();
			f.f3();
			
			
			
		}
}








