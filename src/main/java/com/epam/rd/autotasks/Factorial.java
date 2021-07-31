package com.epam.rd.autotasks;

public class Factorial {
    public String factorial(String n) {
        if(Integer.parseInt(n) == 0){
            return "1";
        } else if(Integer.parseInt(n) > 0){
            return getFactorial(Integer.parseInt(n));
        } else{
            throw new IllegalArgumentException();
        }

    }

    public static String getFactorial(int param){
        int factorial = 1;
        for(int i = 1; i < factorial; i++){
            factorial = factorial * i;
        }
        return Integer.toString(factorial);
    }
}
