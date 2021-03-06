package com.thinkxfactor.zomatoplus.models;


import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
@Entity
@Table(name="tbl_user")

public class User implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private long id;
	@Column(name="name")
	private String username;
	@Column(name="type")
	private String type;
	@Column(name="mobile")
	private String mobile;
	@Column(name="address")
	private String address;
	@Column(name="password")
	private String password;
	@Column(name="landmark")
	private String landmark;
	@Column(name="pincode")
	private String pincode;
	public User()
	{
		
	}
	
	
	
	public User(long id, String username, String type, String mobile, String address, String password, String landmark,
			String pincode) {
		super();
		this.id = id;
		this.username = username;
		this.type = type;
		this.mobile = mobile;
		this.address = address;
		this.password = password;
		this.landmark = landmark;
		this.pincode = pincode;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getMobile() {
		return mobile;
	}



	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getLandmark() {
		return landmark;
	}



	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}



	public String getPincode() {
		return pincode;
	}



	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
}