package com.aquatp.calculator.userinterface;

import com.aquatp.calculator.calculus.Brain;
import com.aquatp.calculator.enums.Operations;


public class Handler {
    private StringBuilder sb;
    private Brain brain;

    public void create() {
        brain = new Brain();
        sb = new StringBuilder();
    }

    public void newOperation() {
        brain.createOperation();
    }

    public void addToText(String val) {
        sb.append(val);
    }

    public void addOperation(Operations opType) {
        brain.addOperator(opType);
    }

    // Converts to a Double value and sends it to the operation
    public void addToOperation() {
        if (!sb.isEmpty()) {
            brain.addNumber(Double.parseDouble(sb.toString()));
        }
    }

    public void performOperation() {
        clear();
        double result = brain.performOperation();
        sb.append(result);
    }

    // Clear everything

    public void cleanStringBuilder() {
        if (sb.toString().startsWith("0")) {
            sb.delete(0,1);
        }
        if (sb.toString().contains(".")) {
            String[] splitNum = sb.toString().split("[.]");
            if (Integer.parseInt(splitNum[1]) == 0) {
                sb.delete(sb.indexOf("."), sb.length());
            }
        }
    }

    public void clear() {
        sb.delete(0,sb.length());
    }

    public StringBuilder getStringBuilder() {
        return sb;
    }

}