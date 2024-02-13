package HirerchalInheritance;

public class PhonePay extends SBI {
	
	int phoneNo = 1234567890;
	
	public void createAC () {
		
		System.out.println("Creating phone pay A/c");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PhonePay p = new PhonePay();
		System.out.println(p.Name);
		p.show();
		System.out.println(p.Atno);
		p.passbook();
		System.out.println(p.phoneNo);
		p.createAC();
	}

}
