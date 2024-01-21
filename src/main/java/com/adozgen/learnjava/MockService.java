package com.adozgen.learnjava;


import org.springframework.stereotype.Component;

@Component
public class MockService implements IService {
    @Override
    public void find() {
        System.out.println("test");
    }
}
