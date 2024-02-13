package Practice;

public class Mobile {
	
	String Name;
	int Price;
	String RAM;
	String ROM;
	
	Mobile (String Name, int Price, String RAM, String ROM)
	{
		this.Name= Name;
		this.Price= Price;
		this.RAM= RAM;
		this.ROM= ROM;
	}
	public void display () 
	{
		
		System.out.println (Name+","+Price+","+RAM+","+ROM);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Mobile M1 = new Mobile ("Redmi",15000,"6gb","128gb");
		Mobile M2 = new Mobile ("VIVO",20000,"6gb","128gb");
		Mobile M3 = new Mobile ("POCO",7000,"4gb","64gb");
		M1.display();
		M2.display();
		M3.display();
	}

}
