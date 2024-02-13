package Practice;

public class Laptop {
	
	String Name;
	int Cost;
	int RAM;
	String Processer;
	
	Laptop (String Name, int Cost, int RAM, String Processer)
	{
		this.Name= Name;
		this.Cost= Cost;
		this.RAM= RAM;
		this.Processer= Processer;
					
	}
	public void display ()
	{
		System.out.println(Name+","+Cost+","+RAM+","+Processer);
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Laptop L1 = new Laptop("Dell",40000,8,"Intel i5");
		Laptop L2 = new Laptop("HP",46000,8,"Intel i5");
		Laptop L3 = new Laptop("Lenovo",42000,8,"Intel i5");
		Laptop L4 = new Laptop("Asus",34000,4,"Intel i3");
		L1.display();
		L2.display();
		L3.display();
		L4.display();
	}

}
