package com.equinix.ioa.wb.node.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.equinix.ioa.wb.node.integration.RolesClientService;
import com.equinix.ioa.wb.node.model.Role;

@RestController
@RequestMapping("/roles-integration")
public class RolesIntegrationController {

	@Autowired
	private RolesClientService rolesClientService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public Role getRole(@PathVariable int id) {
		System.out.println("Se ejecuto desde node-service");
		return rolesClientService.getRole(id);
	}
}
