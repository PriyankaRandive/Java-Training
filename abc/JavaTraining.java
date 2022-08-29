package com.abc;

import java.util.logging.Logger;

public class JavaTraining {
	static Logger logger=Logger.getLogger(JavaTraining.class.getName());
	String employee;
	String chair;
	int bottle;
	double whiteboard;
	
	public String getEmployee()
	{
		return employee;
	}
	
	public void setEmployee(String name){  
		this.employee=name;  
	}
    
	public String getChair()
	{
		return chair;
	}
	
	public void setChair(String type){  
		this.chair=type;  
	}

	public int getBottle()
	{
		return bottle;
	}
	
	public void setBottle(int color){  
		this.bottle=color;  
	}

	public double getWhiteBoard()
	{
		return whiteboard;
	}
	public void setWhiteBoard(double size) {
		this.whiteboard=size;
	}
	  void bags(String color,int numbers) {
	    	System.out.println("This are the bags of the employees");
	    }
	    void bags(String size,int b,int c) {
	    	System.out.println("This are the bags of the employees");
	    }
	    
	        
	
	public static void main(String[] args) {
		logger.info("this is for log");
		JavaTraining e1=new JavaTraining();
	    e1.setEmployee("Priyanka");
	    System.out.println(e1.getEmployee());
	    
	    e1.setChair("Wheel");
	    System.out.println(e1.getChair());
	    
	    e1.setBottle(1);
	    System.out.println(e1.getBottle());
	    
	    e1.setWhiteBoard(1.6);
	    System.out.println(e1.getWhiteBoard());
	    
	    e1.bags("Pink",3);
	    
	    
	    Object[] javaObjectArray
        = { "Maruti", "Wheel", 12,
            1.7 };
	    
	    
	    for (Object object : javaObjectArray) {
			System.out.println("Values are:"+object);
					
			
		}
	}
}
