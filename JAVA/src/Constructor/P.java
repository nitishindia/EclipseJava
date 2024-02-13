package Constructor;

public class P {
	
	P(){
		this(1); // by using this it's become constructor chaining (less obj creation)
		System.out.println("Default constructor");
	}
	P(int a){
		this("next");
		System.out.println("Int type constructor");
		
	}
	P(String s){
		this(1, 1.1);
		
		System.out.println("string type constructor");
	}
	P(int a, double d){
		System.out.println("int and double type constructor");
	}
	public static void main(String[] args) {
		P p = new P();
//		P p1 = new P(11, 11.1);
//		P p2 = new P("jrtyy");
	}
	

}
