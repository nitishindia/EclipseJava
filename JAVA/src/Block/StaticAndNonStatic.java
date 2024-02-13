package Block;

public class StaticAndNonStatic {
	
	static {
		System.out.println("SB1");
	}
	{
		System.out.println("NSB1");
	}
	static
	{
		StaticAndNonStatic s = new StaticAndNonStatic();
	}
	{
		System.out.println("NSB2");
	}

	public static void main(String[] args) {
		StaticAndNonStatic s = new StaticAndNonStatic();
		System.out.println("Hii");
		

	}

}
