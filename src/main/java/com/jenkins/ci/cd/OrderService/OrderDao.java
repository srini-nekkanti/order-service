package com.jenkins.ci.cd.OrderService;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {

    public List<Order> getOrders(){
        return Stream.of(new Order(101,"mobile",20000,1),
                new Order(102,"book",999,3),
                new Order(101,"book",1466,2),
                new Order(101,"jeans",4900,1)
        ).collect(Collectors.toList());
    }
}
