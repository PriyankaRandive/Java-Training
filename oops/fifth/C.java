package com.oops.fifth;

import java.util.Scanner;

public abstract class C extends B{
	int mul;

	@Override
	void mul(int a, int b) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter first number: ");
	    a= sc.nextInt();
	    System.out.println("Enter second number: ");
	    b = sc.nextInt();
		mul=a*b;
		System.out.println("multiplication is:" +mul);
		// TODO Auto-generated method stub
		
		
	}
	
	}
	

