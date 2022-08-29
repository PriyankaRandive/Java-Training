package com.oops.sixth;

import java.util.Scanner;

public class B extends A{

	@Override
	void max(int a, int b, int c) {
		Scanner sc = new Scanner(System.in);

	    System.out.println("Enter third number: ");
	    c= sc.nextInt();
	    if(a>b && a>c)

		  {
		  System.out.println("a is greater");
		  }
	   
		
		super.max(a, b, c);
	}

	@Override
	void max1(int a, int b, int c, int d) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fourth number: ");
		    d= sc.nextInt();
		 if(b>a && b>c && b>d)

		  {
		  System.out.println("b is greater");
		  }
	  
 
		super.max1(a, b, c, d);
	}

	
	  }

