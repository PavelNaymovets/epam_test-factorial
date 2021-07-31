package com.epam.rd.autotasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialBadInputTesting {

    Factorial factorial = new Factorial();

    @Test
    void testNullInput(){
        assertThrows(IllegalArgumentException.class, () -> {factorial.factorial(null);});
    }

    @Test
    void testNegativeInput(){
        String negativeInput = "-10";
        assertThrows(IllegalArgumentException.class, () ->{factorial.factorial(negativeInput);});
    }

    @Test
    void testFractionalInput(){
        String factorialInput = "1.2";
        assertThrows(IllegalArgumentException.class,() ->{factorial.factorial(factorialInput);});
    }

    @Test
    void testNonDigitalInput(){
        String nonDigital = "abc";
        assertThrows(IllegalArgumentException.class, ()->{factorial.factorial(nonDigital);});
    }


}
