package com.oops.third;

public class Customer_Account_Statement {
	int CAID;
	int CustId;
	int amount;
	int deposit_withdrawl;
	int deposit_date;
	public int getCAID() {
		return CAID;
	}
	public void setCAID(int cAID) {
		CAID = cAID;
	}
	public int getCustId() {
		return CustId;
	}
	public void setCustId(int custId) {
		CustId = custId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getDeposit_withdrawl() {
		return deposit_withdrawl;
	}
	public void setDeposit_withdrawl(int deposit_withdrawl) {
		this.deposit_withdrawl = deposit_withdrawl;
	}
	public int getDeposit_date() {
		return deposit_date;
	}
	public void setDeposit_date(int deposit_date) {
		this.deposit_date = deposit_date;
	}
	

}
