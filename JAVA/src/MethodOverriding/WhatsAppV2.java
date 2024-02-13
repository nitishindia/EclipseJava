package MethodOverriding;

public class WhatsAppV2 extends WhatsAppV1 {

	@Override
	void message() {
		System.out.println("Double tick");
	}

	@Override
	void call() {
		System.out.println("Audio Call");
	}
	

}
