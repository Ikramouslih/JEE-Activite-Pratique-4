package com.emsi.orderservice.entities;

import com.emsi.orderservice.enums.OrderStatus;
import com.emsi.orderservice.model.Customer;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.List;

@Projection(name="fullOrder", types=Order.class)
public interface OrderProjection {
     Long getId();
     Date getCreatedAt();
     Long getCustomerId();
     OrderStatus getStatus();
}