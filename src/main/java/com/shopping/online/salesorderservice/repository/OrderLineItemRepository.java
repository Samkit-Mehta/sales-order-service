package com.shopping.online.salesorderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.online.salesorderservice.model.OrderLineItem;

public interface OrderLineItemRepository extends JpaRepository<OrderLineItem,Integer> {

}
