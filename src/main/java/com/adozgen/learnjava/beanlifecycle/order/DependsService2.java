package com.adozgen.learnjava.beanlifecycle.order;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@DependsOn("dependsService1") // depends on another bean.
public class DependsService2 {
}
