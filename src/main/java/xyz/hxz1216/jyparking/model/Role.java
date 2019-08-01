package xyz.hxz1216.jyparking.model;

public class Role {
	private Integer rId;
	private  String roleName;

	public Role() {
	}

	public Role(Integer rId, String roleName) {
		this.rId = rId;
		this.roleName = roleName;
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
}
