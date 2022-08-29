package com.oops.sixth;

import java.util.Scanner;

public class A {
  void max(int a,int b,int c)
  {
	  Scanner sc = new Scanner(System.in);
	    System.out.println("Enter first number: ");
	    a= sc.nextInt();
	    System.out.println("Enter second number: ");
	    b = sc.nextInt();
	    
	    System.out.println("Enter third number: ");
	    c= sc.nextInt();
	   
	  if(a>b && a>c)

		  {
		  System.out.println("a is greater");
		  }
	  
  }
  
  void max1(int a,int b,int c,int d)
  {
	  if(b>a && b>c && b>d)

		  {
		  System.out.println("b is greater");
		  }
	  
  }
}
