package com.equinix.ioa.wb.node;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.equinix.ioa.wb.node.integration")
public class NodeserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NodeserviceApplication.class, args);
	}
}
