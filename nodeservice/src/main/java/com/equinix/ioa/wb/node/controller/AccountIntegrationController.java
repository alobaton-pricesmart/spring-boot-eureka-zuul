package com.equinix.ioa.wb.node.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.equinix.ioa.wb.node.integration.AccountClientService;
import com.equinix.ioa.wb.node.model.User;

@RestController
@RequestMapping("/account-integration")
public class AccountIntegrationController {

	@Autowired
	private AccountClientService accountClientService;

	@RequestMapping(value = "/login", method = RequestMethod.GET, produces = "application/json")
	public User login() {
		System.out.println("Se ejecuto desde node-service");
		return accountClientService.login();
	}
}
