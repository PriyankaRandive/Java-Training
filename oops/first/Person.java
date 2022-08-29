package com.oops.first;

public class Person extends Employee{
private int pid;
private String pname;
private String paddress;
private long dob;

Person()
{
	super();
	System.out.println("This is person class");
}

public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPaddress() {
	return paddress;
}
public void setPaddress(String paddress) {
	this.paddress = paddress;
}
public long getDob() {
	return dob;
}
public void setDob(long dob) {
	this.dob = dob;
}


}
