package com.phuckhangbui.orderservice.repository;

import com.phuckhangbui.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
