package com.abc;

public class OverloadingExample {
	public void laptop(char color,int size,char shape)
	{
		System.out.println("Information about laptop");
		
	}
	
	public void laptop(float type,char color)
	{
		System.out.println("this is the second type of laptop");
	}
    
	public void laptop(int number, float type, char color)
	{
		System.out.println("this is the third type of laptop");
	}
	public static void main(String[] args) {
		OverloadingExample o1=new OverloadingExample();
		o1.laptop('b',1,'r');
		o1.laptop(4,1,'r');
		
		
	}
}
