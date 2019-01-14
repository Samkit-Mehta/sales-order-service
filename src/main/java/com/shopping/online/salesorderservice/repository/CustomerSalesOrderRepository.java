package com.shopping.online.salesorderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.online.salesorderservice.model.CustomerSalesOrder;

public interface CustomerSalesOrderRepository extends JpaRepository<CustomerSalesOrder,Integer> {

}
