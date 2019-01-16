package com.shopping.online.salesorderservice.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.shopping.online.salesorderservice.model.Customer;
import com.shopping.online.salesorderservice.repository.CustomerSalesOrderRepository;

@Service
public class KafkaConsumer {

	@Autowired
	CustomerSalesOrderRepository customerSalesOrderRepository;
	
	@KafkaListener(topics = "customer-created", groupId = "group_id",containerFactory = "kafkaListenerContainerFactory")
	public void consume(Customer customer){
		customerSalesOrderRepository.save(customer);
	}
}
