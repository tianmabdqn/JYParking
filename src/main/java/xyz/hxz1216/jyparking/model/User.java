package xyz.hxz1216.jyparking.model;

import java.util.Date;

public class User {

private Integer	uId;
private String userName;
	private String loginPassword;
	private String loginName;
	private String phone;
	private Integer sex;
	private Date birth;
	private Integer roleId;
	private  String email;
	private double balance;
	private int menberOrNot;

	public User() {
	}

	public User(Integer uId, String userName, String loginPassword, String loginName, String phone, Integer sex, Date birth, Integer roleId, String email, double balance, int menberOrNot) {
		this.uId = uId;
		this.userName = userName;
		this.loginPassword = loginPassword;
		this.loginName = loginName;
		this.phone = phone;
		this.sex = sex;
		this.birth = birth;
		this.roleId = roleId;
		this.email = email;
		this.balance = balance;
		this.menberOrNot = menberOrNot;
	}

	public int getMenberOrNot() {
		return menberOrNot;
	}

	public void setMenberOrNot(int menberOrNot) {
		this.menberOrNot = menberOrNot;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
