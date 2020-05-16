package org.anil.feing;

import java.util.List;

import org.anil.bean.OrderBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name = "order-service", url = "${ORDER_SERVICE_URI:http://localhost}:5200")
public interface OrderServiceProxy {

	@GetMapping("/orders/{id}")
	public List<OrderBean> getOrders(@PathVariable Long id);
}
