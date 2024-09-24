package com.example.lr1_roz_obch;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField fieldA,fieldB,fieldN,fieldTHR;
    @FXML
    private Label resultLab, timeLab;

    private Function function=new Function();
    private CalculateIntegral calculateIntegral=new CalculateIntegral();

    @FXML
    private void handCompute(){
        try {
            double a=Double.parseDouble(fieldA.getText());
            double b=Double.parseDouble(fieldB.getText());
            int n=Integer.parseInt(fieldN.getText());
            int thr=Integer.parseInt(fieldTHR.getText());
            long startT=System.currentTimeMillis();
            double res=calculateIntegral.calculateIntegral(a,b,n,thr,function);
            long endT=System.currentTimeMillis();
            resultLab.setText("Відповідь: " + res);
            timeLab.setText("Час: " + (endT - startT) + " сек");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}