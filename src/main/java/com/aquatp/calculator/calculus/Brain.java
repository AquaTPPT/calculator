package com.aquatp.calculator.calculus;

import com.aquatp.calculator.enums.Operations;

public class Brain {
    private Memory memory;

    public Brain() {
        this.memory = new Memory();
    }

    public double performOperation() {
        return memory.getLastOperation().performOperation();
    }

    public void createOperation() {
        memory.createOperation();
    }

    public void addNumber(double val) {
        memory.addToOp(val);
    }

    public void addOperator(Operations op) {
        memory.addToOp(op);
    }

    public void showOperation(int id) {
        memory.getLastOperation();
    }

}