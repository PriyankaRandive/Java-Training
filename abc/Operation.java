package com.abc;

public class Operation {
	static int add(int a,int b){return a+b;}  
	  
	static float add(float a, float b  ){return (float)a+b;}  
	  
	}  
	  
	class TestOverloading2{  
	  
	public static void main(String[] args){  
	  
	System.out.println(Test.add(11,11));  
	  
	System.out.println(Test.add(10.09,13.99));  
	  
	System.out.println(Test.add(10.12F,13.00F));  
	  }

}
