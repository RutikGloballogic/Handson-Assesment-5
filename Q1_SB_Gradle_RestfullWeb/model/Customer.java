package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.Id;


 @Entity
public class Customer {
	
	 @Id
	 private int customerid;

	 private String customername;
	 
	 private String customerloginid;
	 
	 private String customerpassword;
	 
	 private String customeraddress;
	 
	 private String customerphone;

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomerloginid() {
		return customerloginid;
	}

	public void setCustomerloginid(String customerloginid) {
		this.customerloginid = customerloginid;
	}

	public String getCustomerpassword() {
		return customerpassword;
	}

	public void setCustomerpassword(String customerpassword) {
		this.customerpassword = customerpassword;
	}

	public String getCustomeraddress() {
		return customeraddress;
	}

	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}

	public String getCustomerphone() {
		return customerphone;
	}

	public void setCustomerphone(String customerphone) {
		this.customerphone = customerphone;
	}
	 
	 
	 
}
