package com.equinix.ioa.wb.account.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.equinix.ioa.wb.account.model.Role;

@RestController
@RequestMapping("/roles")
public class RolesController {
	private List<Role> roles = new ArrayList<>();

	public RolesController() {
		roles.add(new Role(1, "Role1"));	
		roles.add(new Role(2, "Role2"));
	}

	/**
	 * This is a demo API
	 * 
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public Role getRole(@PathVariable int id) {
		Optional<Role> role = roles.stream().filter(role1 -> role1.getId() == id).findFirst();
		return role.get();
	}
}
