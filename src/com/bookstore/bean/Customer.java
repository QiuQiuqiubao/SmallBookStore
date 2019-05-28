package com.bookstore.bean;

public class Customer {
  private int CustomerId;
  private String CustomerName;
  private String CustomerPwd;
  private String Customertruename;
  private String CustomerSex;
  private String CustomerTel;
  private String CustomerEmail;
  private String CustomerAddr;
  
  public Customer(){
	  
	  
  }
  
  public Customer(int CustomerId,String CustomerName,String CustomerPwd,String Customertruename,String CustomerSex,String CustomerTel,String CustomerEmail,String CustomerAddr){
	  super();
	  this.CustomerId=CustomerId;
	  this.CustomerName=CustomerName;
	  this.CustomerPwd=CustomerPwd;
	  this.Customertruename=Customertruename;
	  this.CustomerSex=CustomerSex;
      this.CustomerTel=CustomerTel;
      this.CustomerEmail=CustomerEmail;
      this.CustomerAddr=CustomerAddr;
  }

public int getCustomerId() {
	return CustomerId;
}

public void setCustomerId(int customerId) {
	CustomerId = customerId;
}

public String getCustomerName() {
	return CustomerName;
}

public void setCustomerName(String customerName) {
	CustomerName = customerName;
}

public String getCustomerPwd() {
	return CustomerPwd;
}

public void setCustomerPwd(String customerPwd) {
	CustomerPwd = customerPwd;
}

public String getCustomertruename() {
	return Customertruename;
}

public void setCustomertruename(String customertruename) {
	Customertruename = customertruename;
}

public String getCustomerSex() {
	return CustomerSex;
}

public void setCustomerSex(String customerSex) {
	CustomerSex = customerSex;
}

public String getCustomerTel() {
	return CustomerTel;
}

public void setCustomerTel(String customerTel) {
	CustomerTel = customerTel;
}

public String getCustomerEmail() {
	return CustomerEmail;
}

public void setCustomerEmail(String customerEmail) {
	CustomerEmail = customerEmail;
}

public String getCustomerAddr() {
	return CustomerAddr;
}

public void setCustomerAddr(String customerAddr) {
	CustomerAddr = customerAddr;
}
  
  
  
}
