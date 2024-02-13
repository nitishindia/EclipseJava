package Yom;

import java.util.Scanner;

public class Loop {
	
	public void mult (int a , int b)
	{
	int c = a*b;
	System.out.println(c);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter first num");
		int a = s.nextInt();
		System.out.println("enter second num");
		int b = s.nextInt();
		
		System.out.println("multiplication");
		
		Loop m = new Loop();
		m.mult(a,b);

	}

}
