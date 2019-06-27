package com.example.unittest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentA {
    @Autowired
    private ComponentB componentB;

    public void print() {
        componentB.pringMessage();
    }
}
