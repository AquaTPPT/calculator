package com.aquatp.calculator.calculus;

import com.aquatp.calculator.enums.Operations;

import java.util.ArrayList;
import java.util.List;

// This might need some refactoring in the future, it'll do for now

public class Operation {
    private List<Double> numbers;
    private List<Operations> operators;

    // Constructor
    public Operation() {
        numbers = new ArrayList<>();
        operators = new ArrayList<>();
    }


    public void addNumber(double number) {
        numbers.add(number);
        System.out.println(toString());
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

        for (int i = 0; i < numbers.size() - 1; i++) {

            double nextNumber = numbers.get(i + 1);

            switch (operators.get(i)) {
                case PLUS -> startingNumber += nextNumber;
                case MINUS -> startingNumber -= nextNumber;
                case DIVIDE -> startingNumber /= nextNumber;
                case MULTIPLY -> startingNumber *= nextNumber;
            }
        }

        return startingNumber;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            if (i < numbers.size() - 1) {
                sb.append(numbers.get(i) + ", ");
            }
            else {
                sb.append(numbers.get(i) + ".");
            }
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
}