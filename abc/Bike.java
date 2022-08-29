package com.abc;

abstract class Bike {
	abstract void run();
	public static void show() {
	System.out.println("this is show");
	}
	 }
	 class Honda4 extends Bike{
	 void run()
	 {
	   System.out.println("running safely..");
	}
	 public static void main(String args[]){
	         Bike obj = new Honda4();
	        obj.run();
	  Bike.show();
	 }
	 }

