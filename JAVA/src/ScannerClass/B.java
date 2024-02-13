package ScannerClass;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		
		System.out.println("Enter the first name");
		Scanner s = new Scanner(System.in);
		String a=s.nextLine();
		System.out.println("Enter the last name");
		String b=s.nextLine();
		System.out.println("full Name =" + (a + b));

	}

}
