package com.epam.rd.autotasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialRegularInputTesting {

    Factorial factorial = new Factorial();

    @Test
    public void testBigIntInput(){
        String input = "15";
        assertThrows(IllegalArgumentException.class, () ->{
            factorial.factorial(input);
        });
    }
}
