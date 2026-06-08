package com.aquatp.calculator.userinterface;

import com.aquatp.calculator.calculus.Calculator;
import javafx.scene.control.Label;
import javafx.util.converter.NumberStringConverter;



public class GUI {
    private Calculator calc;
    private StringBuilder sb;
    private boolean isFirstValue = true;
    private double val1, val2, result;


    public void create() {
        calc = new Calculator();
        sb = new StringBuilder();
    }

    public void addWholeNumberToText(String val) {
        if (sb.toString().equals("0")) {
            sb.delete(0,1);
        }

        sb.append(val);
    }

    // clean the screen

    public void clear() {
        sb.delete(0,sb.length());
        sb.append("0");
    }


    //invoke operations

    public void add() {
        result = calc.sum(val1, val2);
        showResult();
    }

    public void subtract() {
        result = calc.subtract(val1, val2);
        showResult();
    }

    public void divide() {
        result =  calc.divide(val1, val2);
        showResult();
    }

    public void multiply() {
        result = calc.multiply(val1, val2);
        showResult();
    }

    public void sqrt() {
        result = calc.squareRoot(val1);
        showResult();
    }

    public void showResult() {
        clear();
        sb.append(result);
    }

    public double convertToNumber() {
        return Double.parseDouble(sb.toString());
    }

    // value selectors

    public void toFirstValue() {
        isFirstValue = true;
    }

    public void toSecondValue() {
        isFirstValue = false;
    }

    // getters and setters

    public StringBuilder getStringBuilder() {
        return sb;
    }

    public void setVal1() {
        val1 = convertToNumber();
        System.out.println(val1);
    }

    public void setVal2() {
        val2 = convertToNumber();
        System.out.println(val2);
    }

    public void setResultToVal1() {
        val1 = result;
    }

    public void cleanStringBuilder() {
        if (sb.toString().contains(".")) {
            String[] splitNum = sb.toString().split("[.]");
            if (Integer.parseInt(splitNum[1]) == 0) {
                sb.delete(sb.indexOf("."), sb.length());
            }
        }
    }

    // Clear everything

    public void clean() {
        val1 = 0;
        val2 = 0;
        result = 0;
        clear();
    }

}
