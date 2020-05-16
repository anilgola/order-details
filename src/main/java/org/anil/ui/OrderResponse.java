package org.anil.ui;

import java.util.Date;

public class OrderResponse {

	
	private String orderId;
	private Integer orderAmount;
	private Date orderDate;
	
	public OrderResponse() {
		super();
	}
	public OrderResponse(String orderId, Integer orderAmount, Date orderDate) {
		super();
		this.orderId = orderId;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Integer getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Integer orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	
	
}
