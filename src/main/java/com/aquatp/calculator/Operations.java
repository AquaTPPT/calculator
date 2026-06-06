package com.aquatp.calculator;

public class Operations {
    private double currentVal = 0;


    public double sum(double val1) {
        return currentVal += val1;
    }

    public double subtract(double val1) {
        return currentVal -= val1;
    }

    public double divide(double val1) {
        return currentVal /= val1;
    }

    public double multiply(double val1) {
        return currentVal *= val1;
    }

    public double squareRoot() { return Math.sqrt(currentVal); }

    //getters and setters

    public double getCurrentVal() {
        return currentVal;
    }

    public void setCurrentVal(int newVal) {
        currentVal = newVal;
    }
}
