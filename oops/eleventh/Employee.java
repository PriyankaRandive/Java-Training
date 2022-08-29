package com.oops.eleventh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	private String empAddress;
	private Date emp_dob;
	private Date emp_doj;

	public Employee(int empId, String empName, double empSalary, String empAddress, Date emp_dob, Date emp_doj) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
		this.emp_dob = emp_dob;
		this.emp_doj = emp_doj;
	}

	int getEmpId() {
		return empId;
	}

	void setEmpId(int empId) {
		this.empId = empId;
	}

	String getEmpName() {
		return empName;
	}

	void setEmpName(String empName) {
		this.empName = empName;
	}

	double getEmpSalary() {
		return empSalary;
	}

	void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	String getEmpAddress() {
		return empAddress;
	}

	void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	Date getEmp_dob() {
		return emp_dob;
	}

	void setEmp_dob(Date emp_dob) {
		this.emp_dob = emp_dob;
	}

	Date getEmp_doj() {
		return emp_doj;
	}

	void setEmp_doj(Date emp_doj) {
		this.emp_doj = emp_doj;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empAddress="
				+ empAddress + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
	}

	public static void main(String[] args) {
		String birthDate = "31/12/1993";
		Date dob = null;
		String joinDate = "24/2/2021";
		Date doj = null;
		try {
			dob = new SimpleDateFormat("dd/MM/yyyy").parse(birthDate);
			doj = new SimpleDateFormat("dd/MM/yyyy").parse(joinDate);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		Employee emp = new Employee(111, "nilesh", 100000, "pune", dob, doj);
		System.out.println(emp);
	}
}