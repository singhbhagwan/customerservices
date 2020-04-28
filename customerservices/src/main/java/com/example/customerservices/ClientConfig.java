package com.example.customerservices;

//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ClientConfig {
	//@LoadBalanced
	@Bean
	public RestTemplate getTemplate()
	{
		return new RestTemplate();
	}

}
