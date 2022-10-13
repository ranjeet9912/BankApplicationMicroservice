package com.ps.exs.pentity;

public class BankModel {
	private int accountNumber;
	private String accHoldName;
	private int BalAmmount;
	public BankModel(int accountNumber, String accHoldName, int balAmmount) {
		super();
		this.accountNumber = accountNumber;
		this.accHoldName = accHoldName;
		BalAmmount = balAmmount;
	}
	public BankModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccHoldName() {
		return accHoldName;
	}
	public void setAccHoldName(String accHoldName) {
		this.accHoldName = accHoldName;
	}
	public int getBalAmmount() {
		return BalAmmount;
	}
	public void setBalAmmount(int balAmmount) {
		BalAmmount = balAmmount;
	}
	@Override
	public String toString() {
		return "BankModel [accountNumber=" + accountNumber + ", accHoldName=" + accHoldName + ", BalAmmount="
				+ BalAmmount + "]";
	}






}
