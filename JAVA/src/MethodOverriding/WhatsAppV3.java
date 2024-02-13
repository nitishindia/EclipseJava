package MethodOverriding;

public class WhatsAppV3 extends WhatsAppV2{

	@Override
	void message() {
		System.out.println("Blue tick");
	}

	@Override
	void call() {
		System.out.println("Video Call");
		
	}
	
	public static void main (String [] args) {

	WhatsAppV3 w = new WhatsAppV3();
	w.message();
	w.call();
	}

}
