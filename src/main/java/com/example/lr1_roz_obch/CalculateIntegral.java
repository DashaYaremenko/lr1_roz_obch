package com.example.lr1_roz_obch;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CalculateIntegral {
    public double calculateIntegral(double a, double b, int n, int nThreads, FunctionInter fun ) throws InterruptedException {
        double h= (b-a)/n;
        ExecutorService executorService= Executors.newFixedThreadPool(nThreads);
        double [] result= new double[nThreads];
        for (int i = 0; i < nThreads; i++) {
            final int threadInd = i;
            executorService.execute(()->{
                double sum = 0;
                for (int j = threadInd; j < n; j+= nThreads) {
                    double x= a+j*h;
                    sum+= fun.calculate(x)*h;
                }
                result[threadInd]= sum;
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.HOURS);
        double total = 0;
        for (double res : result) {
            total += res;
        }
        return total;

    }
}
