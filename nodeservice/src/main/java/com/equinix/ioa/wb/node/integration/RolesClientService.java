package com.equinix.ioa.wb.node.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.equinix.ioa.wb.node.model.Role;

@Component("rolesClientService")
@FeignClient(contextId = "rolesClientService", value = "account-service")
@RequestMapping("/accountservice/roles")
public interface RolesClientService {

	@GetMapping("/{id}")
	Role getRole(@PathVariable int id);

}
