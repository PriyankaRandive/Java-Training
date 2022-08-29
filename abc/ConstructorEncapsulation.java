package com.abc;

public class ConstructorEncapsulation {

	
		String employee;
		String chair;
		int bottle;
		double whiteboard;
		
		ConstructorEncapsulation(String employee,String chair,int bottle,double whiteboard){
			this.employee=employee;
			this.chair=chair;
			this.bottle=bottle;
			this.whiteboard=whiteboard;
			
		}
	void display()
	{
		System.out.println(employee+" "+chair+" "+bottle+" "+whiteboard);
	}
public static void main(String[] args) {
	ConstructorEncapsulation c4=new ConstructorEncapsulation("Priyanka","Wheel",12,1.7);
	ConstructorEncapsulation c5=new ConstructorEncapsulation("Randive","Stand",16,1.5);
	c4.display();
	c5.display();
	
}
}
