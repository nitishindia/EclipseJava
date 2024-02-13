package Yom;

import java.util.Scanner;

public class A {
	
	public void add (int a , int b)
	{
		
		int c = a+b;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("enter first num");
		int a = s.nextInt();
		System.out.println("enter sec num");
		int b = s.nextInt();
				
				A X = new A();
			X.add (a,b);
	}

}
