package xyz.hxz1216.jyparking.model;

public class Product {
	private Integer proId;
	private  Integer vehicleType;
	private Double money;

	public Product() {
	}

	public Product(Integer proId, Integer vehicleType, Double money) {
		this.proId = proId;
		this.vehicleType = vehicleType;
		this.money = money;
	}

	public Integer getProId() {
		return proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public Integer getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(Integer vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}
}
