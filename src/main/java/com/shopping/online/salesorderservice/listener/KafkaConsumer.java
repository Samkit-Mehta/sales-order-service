package com.shopping.online.salesorderservice.listener;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shopping.online.salesorderservice.model.Customer;
import com.shopping.online.salesorderservice.repository.CustomerSalesOrderRepository;

@Service
public class KafkaConsumer {

	@Autowired
	CustomerSalesOrderRepository customerSalesOrderRepository;
	
    @KafkaListener(topics = "customer-created", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
        try {
			Customer customer = new ObjectMapper().readValue(message, Customer.class);
			customerSalesOrderRepository.save(customer);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }


    @KafkaListener(topics = "customer-created-json", groupId = "group_json",
            containerFactory = "customerKafkaListenerFactory")
    public void consumeJson(Customer customer) {
        System.out.println("Consumed JSON Message: " + customer);
        customerSalesOrderRepository.save(customer);
    }
}
