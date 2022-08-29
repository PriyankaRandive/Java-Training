package com.oops.second;

public class Rectangle implements Shape {
	  int l = 15, b = 12;
	    double ar;
	   
	    public void area()
	    {
	       
	        ar = l * b;
	        System.out.println("Area of rectangle:"+ar);
	    }
}
