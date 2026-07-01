package com.aquatp.calculator.calculus;

import com.aquatp.calculator.enums.Operations;

import java.util.ArrayList;
import java.util.List;

// This might need some refactoring in the future, it'll do for now

public class Operation {
    private List<Double> numbers;
    private List<Operations> operators;
    private double result;

    // Constructor
    public Operation() {
        numbers = new ArrayList<>();
        operators = new ArrayList<>();
    }


    public void addNumber(double number) {
        numbers.add(number);
        System.out.println(showNumbers());
    }

    public void addNumbers(double[] numbers) {
        for (double number : numbers) {
            this.numbers.add(number);
        }
    }

    public void addOperator(Operations operator) {
        operators.add(operator);
        System.out.println(showOperators());
    }

    public double performOperation() {
        double startingNumber = numbers.get(0);

        if (numbers.size() == 1) { // This means that it's a special case that has to be addressed separately

            switch (operators.get(0)) {
                case SQRT -> {
                    return result = Math.sqrt(startingNumber);
                }
                case RECIPROCAL -> {
                    return result = 1 / startingNumber;
                }
            }
        }

        for (int i = 0; i < numbers.size() - 1; i++) {

            double nextNumber = numbers.get(i + 1);

            switch (operators.get(i)) {
                case PLUS -> startingNumber += nextNumber;
                case MINUS -> startingNumber -= nextNumber;
                case DIVIDE -> startingNumber /= nextNumber;
                case MULTIPLY -> startingNumber *= nextNumber;
                // special cases
                case SQRT -> {
                    return result = Math.sqrt(startingNumber);
                }
                case RECIPROCAL -> {
                    return result = 1 / startingNumber;
                }
            }
        }

        result = startingNumber;
        return startingNumber;
    }

    public void displayHistory() {

    }

    // ----- // ------ //

    // for debug purposes
    public String showOperation() {
        StringBuilder sb = new StringBuilder();
        sb.append(numbers.get(0) + " ");
        for (int i = 0; i < operators.size(); i++) {
            sb.append(operators.get(i) + " " + numbers.get(i + 1) + " ");
        }
        return sb.toString();
    }

    public String showOperators() {
        StringBuilder sb = new StringBuilder();
        for (Operations operator : operators) {
            sb.append(operator + " ");
        }
        return sb.toString();
    }

    public String showNumbers() {
        StringBuilder sb = new StringBuilder();
        for (double nums : numbers) {
            sb.append(nums + " ");
        }
        return sb.toString();
    }

    // Will be useful in a later implementation

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(numbers.get(0) + " ");

        for (int i = 0; i < operators.size(); i++) {
            switch (operators.get(i)) {
                case PLUS -> sb.append("+ ");
                case MINUS -> sb.append("- ");
                case MULTIPLY -> sb.append("* ");
                case DIVIDE -> sb.append("/ ");
            }

            sb.append(numbers.get(i + 1) + " = " + result);
        }

        return sb.toString();
    }

}