package Class_Cast_Exeption;

public class Animal {
	
	String name;
	
	Animal(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

}
