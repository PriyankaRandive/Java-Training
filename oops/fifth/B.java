package com.oops.fifth;

import java.util.Scanner;

public abstract class B extends A{
	int sub;

	@Override
	void sub(int a, int b) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter first number: ");
	    a= sc.nextInt();
	    System.out.println("Enter second number: ");
	    b = sc.nextInt();
		sub=a-b;
		System.out.println("Substraction is:" +sub);
		// TODO Auto-generated method stub
		
		
	}
	

}
