package com.flymanager.gateway.configuration;

import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoutesConfig {
	/** Dynamic routes configuration (fetching instances from eureka-server) **/
	@Bean
	public DiscoveryClientRouteDefinitionLocator appRouteDefinitionLocator(ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties dlp) {
		return new DiscoveryClientRouteDefinitionLocator(rdc, dlp);
	}

	/** Static routes configuration **/
	/*
	@Bean
	public RouteLocator routeLocator(RouteLocatorBuilder rlb) {
		return rlb.routes()
				.route((r)->r.path("/engins/**").uri("http://localhost:9101").id("r1"))
				.build();
	}
	*/
}
