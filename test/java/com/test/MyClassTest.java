package com.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class MyClassTest {
    private com.test.MyClass myClass = Mockito.mock(com.test.MyClass.class);

    @Test
    void test() {
        System.out.println("Test runnnnnnnn");
        myClass.process();

        Assertions.assertTrue(true,"Passssssssssssss");
    }
}
