package com.jenkins.ci.cd.OrderService;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private int id;
    private String name;
    private double price;
    private int quantity;
}
