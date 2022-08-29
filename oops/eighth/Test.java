package com.oops.eighth;

import java.util.Scanner;

public class Test {
	
	void getElectronicsDetails()
	{
		Scanner scanner =new Scanner(System.in);
	    System.out.println("Enter employee id");
	    int id=scanner.nextInt();
	    
	  
	    System.out.println("Enter Semiconductor type");
	    String semiconductorType=scanner.next();
	    
	    System.out.println("Enter date of manufacturing");
	    long dateOfManufacturing=scanner.nextLong();
	    

	    Electronics elec=new Electronics ();
	    elec.setId(id);
	    elec.setSemiconductorType(semiconductorType);
	    elec.setDateOfManufacturing(dateOfManufacturing);
	    
	    
	    System.out.println("Electronics Id"+ elec.getId());
	    System.out.println("Semiconductor type"+ elec.getSemiconductorType());
	    System.out.println("dateOfManufacturing "+ elec.getDateOfManufacturing());
	}

		public static void main(String[] args)
		{
			Test test =new Test();
			test.getElectronicsDetails();
			
			Laptop laptop=new Laptop();
			laptop.getLaptopDetails();
			
			LCD lcd=new LCD();
			lcd.getLCDDetails();
			
			Mobile mobile=new Mobile();
			mobile.getMobileDetails();
				
		}
}
	
	
