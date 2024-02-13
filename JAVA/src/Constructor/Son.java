package Constructor;

public class Son extends Father{
	 String Name = "Duggu";
	 int Age = 8;
	 
	 void grandChild() {
		 
		 System.out.println(this.Name);
		 System.out.println(this.Age);
		 System.out.println(super.Name);
		 System.out.println(super.Age);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();
		s.grandChild();

	}

}
