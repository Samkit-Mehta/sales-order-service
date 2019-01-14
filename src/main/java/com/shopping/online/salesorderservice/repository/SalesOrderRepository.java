package com.shopping.online.salesorderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.online.salesorderservice.model.SalesOrder;

public interface SalesOrderRepository extends JpaRepository<SalesOrder,Integer> {

} 
