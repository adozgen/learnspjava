package com.adozgen.learnjava.beans.qualifier;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {
/*    @Autowired
    @Qualifier("productService")
    private GeneralRepository generalRepository;*/

    private GeneralRepository generalRepository;

    @Autowired
    public Manager(@Qualifier("orderService1") GeneralRepository generalRepository) {
        this.generalRepository = generalRepository;
    }
}
