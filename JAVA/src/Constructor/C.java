package Constructor;

public class C {
	
	C()
	{
		this(10);
		System.out.println(1);
	}
	
	C(int i)
	{
		this("qweer");
		System.out.println(2);
	}
	
	C(String s)
	{
		System.out.println("java");
	}

	public static void main(String[] args) {
		
		C c1 = new C();
//		C c2 = new C(10);
//		C c3 = new C("qwe");
		
		

	}

}
