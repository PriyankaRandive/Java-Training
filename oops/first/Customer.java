package com.oops.first;

public class Customer extends Person{
	long date_of_registration;
	String delivery_address;
	int contactno;
	String email_id;
	public long getDate_of_registration() {
		return date_of_registration;
	}
	public void setDate_of_registration(long date_of_registration) {
		this.date_of_registration = date_of_registration;
	}
	public String getDelivery_address() {
		return delivery_address;
	}
	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}
	public int getContactno() {
		return contactno;
	}
	public void setContactno(int contactno) {
		this.contactno = contactno;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	Customer custom=new Customer();
	
	
	
	
	
	

}
