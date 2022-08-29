package com.oops.fifth;

import java.util.Scanner;

public class D extends C{
	int div;

	@Override
	void div(int a, int b) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter first number: ");
	    a= sc.nextInt();
	    System.out.println("Enter second number: ");
	    b = sc.nextInt();
		div=a/b;
		System.out.println("division is:" +div);
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args)
	{
		D d=new D();
		d.sum(1,6);
		d.sub(5,8);
		d.mul(6,5);
		d.div(10,5);
	}
}
