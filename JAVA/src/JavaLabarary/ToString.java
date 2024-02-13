package JavaLabarary;

public class ToString {
	
	String name;
	int id;
	int sal;
	int mobNo;
	
	ToString(String name, int id, int sal, int mobNo ){
		
		this.name = name;
		this.id = id;
		this.sal= sal;
		this.mobNo = mobNo;
		}
		
		
	@Override
	public String toString() {
		return "ToString[name="+name+",id="+id+",sal="+sal+",mobNo="+mobNo+"]";
	}

		public static void main(String[] args) {
			
			ToString ts = new ToString("Ram", 1, 1000, 987654321);
			ToString ts1 = new ToString("Raj", 2, 2000, 87654321);
			ToString ts2 = new ToString("Phir", 3, 3000, 7654321);
			ToString ts3 = new ToString("AAgya", 4, 4000, 654321);
			
//			System.out.println(ts);
//			System.out.println(ts1);
//			System.out.println(ts2);
//			System.out.println(ts3);
			
			ToString [] t= {ts,ts1,ts2,ts3};
			for (int i=0; i<=3; i++) {
				System.out.println(t[i]);
				
			}
		}

}
