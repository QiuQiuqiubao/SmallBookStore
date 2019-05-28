package com.bookstore.bean;

public class Manager {
	private int AdminId;
	private String AdminName;
	private String AdminPwd;
	
	public Manager(){
	}
	
	public Manager(int AdminId,String AdminName,String AdminPwd){
		super();
		this.AdminId=AdminId;
		this.AdminName=AdminName;
		this.AdminPwd=AdminPwd;
	}

	public int getAdminId() {
		return AdminId;
	}

	public void setAdminId(int adminId) {
		AdminId = adminId;
	}

	public String getAdminName() {
		return AdminName;
	}

	public void setAdminName(String adminName) {
		AdminName = adminName;
	}

	public String getAdminPwd() {
		return AdminPwd;
	}

	public void setAdminPwd(String adminPwd) {
		AdminPwd = adminPwd;
	}
	
	
}
