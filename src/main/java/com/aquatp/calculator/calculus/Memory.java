package com.aquatp.calculator.calculus;

import com.aquatp.calculator.enums.Operations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Memory {
    private List<String> memory;
    private Map<Integer, Operation> ops;

    // gotta change these names later on

    public Memory() {
        memory = new ArrayList<>();
        ops = new HashMap<>();
        createOperation();
    }

    public void createOperation() {
        if (ops.isEmpty()) {
            ops.put(0, new Operation());
        }
        else {
            ops.put(ops.size(),new Operation());
        }
    }

    public void addToOp(Operations opType) {
        ops.get(ops.size() - 1).addOperator(opType);
    }

    public void addToOp(double number) {
        ops.get(ops.size() - 1).addNumber(number);
    }

    // add to a different operation other than the last one in the list (for a later implementation)

    public void addToOp(int id, Operations opType) {
        ops.get(id).addOperator(opType);
    }

    public Operation getLastOperation() {
        return ops.get(ops.size() - 1);
    }
}