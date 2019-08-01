package xyz.hxz1216.jyparking.model;

public class Vehicle {
	private Integer vId;
	private String vehicleType;
	private String proId;
	private String	licensePlate;
	private String uId;

	public Vehicle() {
	}

	public Vehicle(Integer vId, String vehicleType, String proId, String licensePlate, String uId) {
		this.vId = vId;
		this.vehicleType = vehicleType;
		this.proId = proId;
		this.licensePlate = licensePlate;
		this.uId = uId;
	}

	public Integer getvId() {
		return vId;
	}

	public void setvId(Integer vId) {
		this.vId = vId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}
}
