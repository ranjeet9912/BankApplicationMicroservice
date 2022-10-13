package com.ps.exs.pentity;

public class Passbook {
			 private int userId;
			 private int accountNumber;
			 private String accHoldName;
			 private int BalAmmont;
			 private String address;
			 private String email;
			public Passbook(int userId, int accountNumber, String accHoldName, int balAmmont, String address, String email) {
				super();
				this.userId = userId;
				this.accountNumber = accountNumber;
				this.accHoldName = accHoldName;
				BalAmmont = balAmmont;
				this.address = address;
				this.email = email;
			}
			public int getUserId() {
				return userId;
			}
			public void setUserId(int userId) {
				this.userId = userId;
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
			public int getBalAmmont() {
				return BalAmmont;
			}
			public void setBalAmmont(int balAmmont) {
				BalAmmont = balAmmont;
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
			public Passbook() {
				super();
				// TODO Auto-generated constructor stub
			}
			@Override
			public String toString() {
				return "Passbook [userId=" + userId + ", accountNumber=" + accountNumber + ", accHoldName=" + accHoldName
						+ ", BalAmmont=" + BalAmmont + ", address=" + address + ", email=" + email + "]";
			}
 
}
