package com.oops.first;

public class Employee {
	
	int emp_id;
	
	long empsalary; 
	long date_of_joining;
	String base_location;
	long dept_doj;
	int contactno;
	String email_id;
	
	
	public int getEmpid() {
		return emp_id;
	}
	public void setEmpid(int empid) {
		this.emp_id = empid;
	}
	public long getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(long empsalary) {
		this.empsalary = empsalary;
	}
	public Long getDate_of_joining() {
		return date_of_joining;
	}
	public void setDate_of_joining(Long date_of_joining) {
		this.date_of_joining = date_of_joining;
	}
	public String getBase_location() {
		return base_location;
	}
	public void setBase_location(String base_location) {
		this.base_location = base_location;
	}
	public long getDept_doj() {
		return dept_doj;
	}
	public void setDept_doj(long dept_doj) {
		this.dept_doj = dept_doj;
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
	
//Employee emp=new Employee();
Department dept=new Department();


}
