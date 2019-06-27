package com.example.unittest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentB {
    @Autowired
    private ComponentC componentC;

    public void pringMessage() {
        System.out.println(componentC.getMessage());
    }
}
