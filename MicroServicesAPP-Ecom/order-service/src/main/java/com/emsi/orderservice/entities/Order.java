package com.emsi.orderservice.entities;


import com.emsi.orderservice.enums.OrderStatus;
import com.emsi.orderservice.model.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @Builder
@Table(name = "orders")
public class Order {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Date createdAt;

    private OrderStatus orderStatus;
    private Long customerId;

    @Transient
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<ProductItem> productItems;

    public double getTotal(){
        double somme = 0;
        for(ProductItem pi:productItems){
            somme += pi.getAmount();
        }
        return somme;
    }
}
