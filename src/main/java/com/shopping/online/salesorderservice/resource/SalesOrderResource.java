package com.shopping.online.salesorderservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.online.salesorderservice.model.SalesOrder;
import com.shopping.online.salesorderservice.repository.SalesOrderRepository;

@RestController
@RequestMapping("/salesorderservice")
public class SalesOrderResource {

	@Autowired
	private SalesOrderRepository salesOrderRepository;
	
	@PostMapping("/orders")
	public Integer addOrder(@RequestBody SalesOrder salesOrder){
		return salesOrderRepository.save(salesOrder).getId();
	}

}
