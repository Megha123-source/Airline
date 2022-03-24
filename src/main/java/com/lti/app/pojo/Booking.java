package com.lti.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookflight99")
public class Booking {
	//ManyToOne using PassengerId
	@Id
	@Column(name="pnrno")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pnrNo; 
	@Column(name="customername")
	private String customerName;
	@Column(name="gender")
	private String gender;
	@Column(name="age")
	private String age;
	@Column(name="phoneno")
	private String phoneNo;
	public long getPnrNo() {
		return pnrNo;
	}
	public void setPnrNo(long pnrNo) {
		this.pnrNo = pnrNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Booking [pnrNo=" + pnrNo + ", customerName=" + customerName + ", gender=" + gender + ", age=" + age
				+ ", phoneNo=" + phoneNo + "]";
	}
	public Booking(long pnrNo, String customerName, String gender, String age, String phoneNo) {
		super();
		this.pnrNo = pnrNo;
		this.customerName = customerName;
		this.gender = gender;
		this.age = age;
		this.phoneNo = phoneNo;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	
}
