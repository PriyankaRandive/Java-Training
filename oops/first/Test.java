package com.oops.first;
import java.util.Scanner;

public class Test {
	public void getUserDetails()
	{
		Scanner scanner =new Scanner(System.in);
	    System.out.println("Enter employee id");
	    int id=scanner.nextInt();
	    
	    
	    System.out.println("Enter employee salary");
	    long salary=scanner.nextLong();
	    

	    System.out.println("Enter employee date_of_joining");
	    long date_of_joining=scanner.nextLong();
	    

	    System.out.println("Enter employee base_location");
	    int base_location=scanner.nextInt();
	    
	    
	    Employee employee=new Employee();
	    employee.setEmpid(id);
	    employee.setEmpsalary(salary);
	    
	    System.out.println("Employee Id"+ employee.getEmail_id());
	    System.out.println("Employee Salary"+ employee.getEmpid());
	    
	    
	    }
	
	
	public static void main(String[] args)
	{
		Test test =new Test();
		test.getUserDetails();
	}

}
