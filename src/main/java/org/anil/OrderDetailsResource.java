package org.anil;

import java.util.List;
import java.util.stream.Collectors;

import org.anil.bean.OrderBean;
import org.anil.bean.UserBean;
import org.anil.feing.OrderServiceProxy;
import org.anil.feing.UserServiceProxy;
import org.anil.ui.OrderDetailsResponse;
import org.anil.ui.OrderResponse;
import org.anil.ui.UserResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderDetailsResource {

	@Autowired
	OrderServiceProxy orderServiceProxy;

	@Autowired
	UserServiceProxy userServiceProxy;
	
	
	@GetMapping("/")
	public String getRoot() {
		return "order-detail-root";
	}
	
	@GetMapping("/order-details/{id}")
	public OrderDetailsResponse getOrderDetails(@PathVariable Long id) {
		
		UserBean userBean = userServiceProxy.getUser(id);
		List<OrderBean> orders = orderServiceProxy.getOrders(id);
		
		
		
		UserResponse userResponse = new UserResponse();
		
		List<OrderResponse> ordersList = orders.stream().map(order -> new OrderResponse(order.getOrderId(),order.getOrderAmount(),order.getOrderDate()))
		   .collect(Collectors.toList());
		
		BeanUtils.copyProperties(userBean, userResponse);
		
		OrderDetailsResponse orderDetailsResponse = new OrderDetailsResponse();
		
		orderDetailsResponse.setUserResponse(userResponse);
		orderDetailsResponse.setListOfOrders(ordersList);
		
		return orderDetailsResponse;
		
	}
	
	
}
