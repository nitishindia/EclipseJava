package ScannerClass;

import java.util.Scanner;

public class Divide {
	
	public void div (int x , int y)
	{
		int z = x/y;
		System.out.println(z);
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		
		System.out.println("enter first num");
		int x = s.nextInt();
		System.out.println("enter sec num");
		int y = s.nextInt();
		
		Divide D = new Divide();
		D.div(x,y);
	}

}
