package com.oops.third;

import java.util.Scanner;




public class TestThird {
	public void getUserDetails()
	{
		Scanner scanner =new Scanner(System.in);
	    System.out.println("Enter customer id");
	    int custid=scanner.nextInt();
	    
	    
	    System.out.println("Enter customer account number");
	    int accountno=scanner.nextInt();
	    

	    System.out.println("Enter customer name");
	    String custname=scanner.next();
	    

	    System.out.println("Enter customer address");
	    String cust_address=scanner.next();
	    

		
	    System.out.println("Enter customerStatement id");
	    int CAID=scanner.nextInt();
	    
	    
	    System.out.println("Enter customeraccountstatement number");
	    int CustId=scanner.nextInt();
	    

	    System.out.println("Enter customer amount");
	    int amount=scanner.nextInt();
	    

	    System.out.println("Enter customeraccount deposit_withdrawl");
	    int deposit_withdrawl=scanner.nextInt();
	    
	    
	    
	   
	    
	    Customer_Account_Statement statement = new Customer_Account_Statement();
	    statement.setCAID(CAID);
	    statement.setCustId(CustId);
	    statement.setAmount(amount);
	    statement.setDeposit_withdrawl(deposit_withdrawl);
	    
	    
	    Customer customer=new Customer();
	    customer.setCustId(custid);
	    customer.setAccountno(accountno);
	    customer.setCustname(custname);
	    customer.setCust_address(cust_address);
	    
	    
	    
	    
	    System.out.println("Customer Id:"+ customer.getCustId());
	    System.out.println("Customer Accountno:"+ customer.getAccountno());
	    System.out.println("Customer Name:"+ customer.getCustname());
	    System.out.println("Customer Address:"+ customer.getCust_address());
	    
	    System.out.println("Customer CAID:"+ statement.getCAID());
	    System.out.println("Customer CustId:"+ statement.getCustId());
	    System.out.println("Customer Amount:"+ statement.getAmount());
	    System.out.println("Customer DepositeWithdrawl:"+ statement.getDeposit_withdrawl());
	    
	} 
	    

		public static void main(String[] args)
		{
			TestThird td=new TestThird();
			td.getUserDetails();
	    }
	

}
