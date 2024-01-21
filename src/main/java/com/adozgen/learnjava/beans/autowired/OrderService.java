package com.adozgen.learnjava.beans.autowired;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

/*    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }*/

    //Veya

/*    @Autowired
    private OrderRepository orderRepository;*/


    //Veya

/*    @Autowired
    private OrderRepository orderRepository;

    public void setOrderRepository(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }*/



}
