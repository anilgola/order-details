package org.anil.feing;


import org.anil.bean.UserBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service", url = "${USER_SERVICE_URI:http://localhost}:5100")
public interface UserServiceProxy {
	
	@GetMapping("/user/{id}")
	public UserBean getUser(@PathVariable Long id);
	
	
}
