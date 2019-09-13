package org.exampledriven.zuul.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class SimpleFilter implements GatewayFilter {

	Logger logger = LoggerFactory.getLogger(SimpleFilter.class);

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		logger.info("BEFORE");
		exchange.getResponse().getHeaders().add("X-SpringOneTour", "Denver");
		return chain.filter(exchange).then(Mono.fromRunnable(() -> {
			logger.info("AFTER");
		}));
	}

}