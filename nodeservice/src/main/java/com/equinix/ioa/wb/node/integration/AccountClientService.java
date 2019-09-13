package com.equinix.ioa.wb.node.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.equinix.ioa.wb.node.model.User;

@Component("accountClientService")
@FeignClient(contextId = "accountClientService", value = "account-service")
@RequestMapping("/accountservice/account")
public interface AccountClientService {

	@GetMapping("/login")
	User login();

}
