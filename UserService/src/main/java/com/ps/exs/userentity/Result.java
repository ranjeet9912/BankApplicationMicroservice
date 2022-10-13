package com.ps.exs.userentity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Result {
	@Id
	private int userID;
	private int accountNumber;
	private String accHoldName;
	private int BalAmmount;
	private String address;
	private String email;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
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
	public void setAccHoldName(String string) {
		this.accHoldName = string;
	}
	public int getBalAmmount() {
		return BalAmmount;
	}
	public void setBalAmmount(int balAmmount) {
		BalAmmount = balAmmount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Result() {
		super();
	}
	public Result(int userID, int accountNumber, String accHoldName, int balAmmount, String address, String email) {
		super();
		this.userID = userID;
		this.accountNumber = accountNumber;
		this.accHoldName = accHoldName;
		BalAmmount = balAmmount;
		this.address = address;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Result [userID=" + userID + ", accountNumber=" + accountNumber + ", accHoldName=" + accHoldName
				+ ", BalAmmount=" + BalAmmount + ", address=" + address + ", email=" + email + "]";
	}
	
	
	

}
