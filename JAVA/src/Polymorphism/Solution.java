package Polymorphism;

public class Solution extends EmpDl {

	public static void main(String[] args) {
		
		Solution sl = new Solution();
		
		System.out.println(sl.getEmpId());
		System.out.println(sl.getEmpName());
		System.out.println(sl.getEmpMob());
		System.out.println(sl.getEmpAC());
		
		sl.setEmpId(8888);
		sl.setEmpName("kumar");
		sl.setEmpMob(8888888);
		sl.setEmpAC(888888888);
		System.out.println(sl.getEmpId());
		System.out.println(sl.getEmpName());
		System.out.println(sl.getEmpMob());
		System.out.println(sl.getEmpAC());
		
		

	}

}
