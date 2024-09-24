package com.example.lr1_roz_obch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculateIntegralTest {

    @Test
    void calculateIntegral() throws InterruptedException {
        CalculateIntegral calc = new CalculateIntegral();
        double a=0;
        double b=Math.PI;
        int n=1000;
        int nTh=4;
        FunctionInter sinF=(x)->Math.sin(x);
        double result = calc.calculateIntegral(a, b, n, nTh, sinF);
        double expected = 2.0;
        assertEquals(expected, result, 0.01);

    }
}