package com.aquatp.calculator.userinterface;

import com.aquatp.calculator.calculus.Calculator;
import javafx.scene.control.Label;
import javafx.util.converter.NumberStringConverter;



public class GUI {
    private NumberStringConverter numberStringConverter;
    private Label label;
    private Calculator operations;
    private StringBuilder sb;
    private boolean isFirstValue = true;


    public void create() {
        operations = new Calculator();
        numberStringConverter = new NumberStringConverter();
        sb = new StringBuilder();
    }

    public void addWholeNumberToText(String val) {
        if (sb.toString().equals("0")) {
            sb.delete(0,1);
        }

        sb.append(val);
        display();
    }

    public void clear() {
        sb.delete(0,sb.length());
        sb.append("0");
        display();
    }

    public void display() {
        System.out.println(sb.toString());
    }

    public void sendToOperations() {
        operations.setCurrentVal(Double.parseDouble(sb.toString()));
        System.out.println(operations.getCurrentVal());
    }

    public StringBuilder getStringBuilder() {
        return sb;
    }

    public void toFirstValue() {
        isFirstValue = true;
    }

    public void toSecondValue() {
        isFirstValue = false;
    }
}
