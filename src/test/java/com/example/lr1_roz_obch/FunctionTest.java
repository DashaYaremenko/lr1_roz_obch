package com.example.lr1_roz_obch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionTest {

    @Test
    void calculate() {
        Function f = new Function();
        double input= 4.0;
        double expected= 6.0;
        double result = f.calculate(input);
        assertEquals(expected,result,0.001);

    }
}