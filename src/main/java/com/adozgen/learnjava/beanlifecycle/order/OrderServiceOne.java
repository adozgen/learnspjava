package com.adozgen.learnjava.beanlifecycle.order;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(1) // order 1 for this service.
public class OrderServiceOne {
}
