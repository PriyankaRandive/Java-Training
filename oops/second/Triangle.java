package com.oops.second;

public class Triangle implements Shape{

	
	 int r =5,h=15;
	    double area = 0;
	  
	    @Override
	    public void area()
	    {
	        area = (h * r) / 2;
	        System.out.println("Area of triangle:"+area);
	    }
}