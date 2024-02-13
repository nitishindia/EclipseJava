package HirerchalInheritance;

public class D extends B {
	
	int D1 = 40;
	
	public static void main(String[] args) {
		
		D d = new D();
		d.z();
		System.out.println(d.A1);
		d.y();
		System.out.println(d.B1);
		System.out.println(d.D1);
	}
	}


