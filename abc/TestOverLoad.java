package com.abc;

public class TestOverLoad {
	public static void main(String[] args)
	  
	{
	  
	System.out.println("main with String[]");
	  
	main();
	  
	main("sunil kumar");
	  
	}  
	  
	public static void main(String args){System.out.println(args);}  
	  
	public static void main(){System.out.println("main without args");}  
	  }  


