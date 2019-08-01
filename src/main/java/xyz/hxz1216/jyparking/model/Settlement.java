package xyz.hxz1216.jyparking.model;

public class Settlement {
private Integer	settId;
			private Integer uid;
	private Double money;

	public Settlement() {
	}

	public Settlement(Integer settId, Integer uid, Double money) {
		this.settId = settId;
		this.uid = uid;
		this.money = money;
	}

	public Integer getSettId() {
		return settId;
	}

	public void setSettId(Integer settId) {
		this.settId = settId;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}
}
