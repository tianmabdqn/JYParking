package xyz.hxz1216.jyparking.model;

import java.util.Date;

public class Order {
	private Integer oid;
	private Date startTime;
	private Date endingTime;
	private  Integer proId;
	private  Integer uId;
	private  Integer orderStatus;
	private  Integer setId;

	public Order() {
	}

	public Order(Integer oid, Date startTime, Date endingTime, Integer proId, Integer uId, Integer orderStatus, Integer setId) {
		this.oid = oid;
		this.startTime = startTime;
		this.endingTime = endingTime;
		this.proId = proId;
		this.uId = uId;
		this.orderStatus = orderStatus;
		this.setId = setId;
	}

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndingTime() {
		return endingTime;
	}

	public void setEndingTime(Date endingTime) {
		this.endingTime = endingTime;
	}

	public Integer getProId() {
		return proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getSetId() {
		return setId;
	}

	public void setSetId(Integer setId) {
		this.setId = setId;
	}
}
