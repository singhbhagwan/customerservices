package com.example.customerservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customer {
	
	@Autowired
	FoodRepository foodOrder;
	
	@PostMapping("/placeorder")
	public String placeOrder(@RequestBody FoodOrder order)
	{
		 foodOrder.save(order);
		 return "SUCCESS";
		
	}

	/*
	 * private static final Logger logger = LoggerFactory.getLogger(Customer.class);
	 * 
	 * @Autowired RestTemplate restTemplate;
	 * 
	 * @GetMapping("/placeorder/{amount}") public String placeorder(@PathVariable
	 * int amount) {
	 * 
	 * logger.info("msg:"+amount); //String
	 * url="http://RESTAURENT-SERVICE/orderqueue/"+amount;
	 * 
	 * return null;//restTemplate.getForObject(url, String.class); }
	 */

}
