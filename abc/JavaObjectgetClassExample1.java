package com.abc;

public class JavaObjectgetClassExample1 {
	 public static void main(String[] args)   
	    {   
	        Object obj = new String("JavaTpoint");   
	        Class a = obj.getClass();   
	        System.out.println("Class of Object obj is : " + a.getName());   
	    }   
	} 

