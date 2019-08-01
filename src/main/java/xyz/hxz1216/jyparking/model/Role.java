package xyz.hxz1216.jyparking.model;

public class Role {
	private Integer rId;
	private  String roleName;
	private  Integer menberOrNot;

	public Role() {
	}

	public Role(Integer rId, String roleName, Integer menberOrNot) {
		this.rId = rId;
		this.roleName = roleName;
		this.menberOrNot = menberOrNot;
	}

	public Integer getrId() {
		return rId;
	}

	public void setrId(Integer rId) {
		this.rId = rId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Integer getMenberOrNot() {
		return menberOrNot;
	}

	public void setMenberOrNot(Integer menberOrNot) {
		this.menberOrNot = menberOrNot;
	}
}
