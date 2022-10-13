package com.ps.exs.pentity;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class User {
	private int userId;
	@NonNull @Size(min=4, message= "UserName must be 4 character")
	private String userName;
	@NonNull@Size(min=5,max=100, message="Address")
	private String address;
	@Email	
	private String email;
	@NotNull
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date createdAt;
	@NotNull
	private String createdBy;
	@NotNull
	private String changedBy;
	@NotNull 
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date changedAt;
	
	public User() {
		super();	
	}
	public User(int userId, String userName, String address, String email, Date createdAt, String createdBy,
			String changedBy, Date changedAt) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.address = address;
		this.email = email;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.changedBy = changedBy;
		this.changedAt = changedAt;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", address=" + address + ", email=" + email
				+ ", createdAt=" + createdAt + ", createdBy=" + createdBy + ", changedBy=" + changedBy + ", changedAt="
				+ changedAt + "]";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getChangedBy() {
		return changedBy;
	}
	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}
	public Date getChangedAt() {
		return changedAt;
	}
	public void setChangedAt(Date changedAt) {
		this.changedAt = changedAt;
	}

}
