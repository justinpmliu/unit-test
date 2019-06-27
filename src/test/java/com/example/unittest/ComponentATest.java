package com.example.unittest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;

import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class ComponentATest {
    @Mock
    private ComponentC componentC;
    @InjectMocks
    private ComponentB componentB;

    private ComponentA componentA;

    @Before
    public void setUp() {
        componentA = new ComponentA();
        ReflectionTestUtils.setField(componentA, "componentB", componentB);
        given(componentC.getMessage()).willReturn("Hello World!");
    }

    @Test
    public void print() {
        componentA.print();
    }
}