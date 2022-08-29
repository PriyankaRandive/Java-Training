package com.oops.fifth;

import java.util.Scanner;

public abstract class A extends CalcAbs{

	int sum;
	
	@Override
	void sum(int a, int b) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter first number: ");
	    a= sc.nextInt();
	    System.out.println("Enter second number: ");
	    b = sc.nextInt();
		sum=a+b;
		System.out.println("Addition is:" +sum);
		// TODO Auto-generated method stub
		
	}
	
}
