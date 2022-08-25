package com.spring.users;

public class UsersEntity {

	private int userid;
	private String userName;
	private int phone;
	
	public UsersEntity() {
		// TODO Auto-generated constructor stub
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UsersEntity [userid=" + userid + ", userName=" + userName + ", phone=" + phone + "]";
	}
	
	
	
}
