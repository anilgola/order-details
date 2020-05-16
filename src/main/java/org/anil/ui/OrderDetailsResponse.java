package org.anil.ui;

import java.util.List;

public class OrderDetailsResponse {

	
	UserResponse userResponse;
	List<OrderResponse> listOfOrders;
	
	
	
	public UserResponse getUserResponse() {
		return userResponse;
	}
	public void setUserResponse(UserResponse userResponse) {
		this.userResponse = userResponse;
	}
	public List<OrderResponse> getListOfOrders() {
		return listOfOrders;
	}
	public void setListOfOrders(List<OrderResponse> listOfOrders) {
		this.listOfOrders = listOfOrders;
	}
	
	
}
