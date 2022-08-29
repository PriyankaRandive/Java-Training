package com.arrays;

public class Rectangle {
	
		  
	    protected int w, l;
	  
	Rectangle(int a, int b)
	  
	{
	  
	  l=a;
	  
	  w=b;
	  
	}
	  
	Public void area()
	  
	  {
	  
	    System.out.println(“Area of rectangle” + l*w);
	    class Main {
	    	  
	        public static void main(String args[]) {
	      
	            Rectangle t = new Rectangle (10,5);
	      
	            System.out.println(t.x + " " + t.y);
	      
	            t.area(); 
	      
	        }
	      
	    }
	  
}
}