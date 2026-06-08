package com.aquatp.calculator.userinterface;

import com.aquatp.calculator.enums.Operations;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.NodeOrientation;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class ButtonHandler {

    @FXML
    private TextArea ta;
    private Operations operationType;
    private GUI gui;


    public ButtonHandler() {
        gui = new GUI();
        gui.create();
    }



    public void zero(ActionEvent e) {
        gui.addWholeNumberToText("0");
        display();
    }

    public void one(ActionEvent e) {
        gui.addWholeNumberToText("1");
        display();
    }

    public void two(ActionEvent e) {
        gui.addWholeNumberToText("2");
        display();
    }

    public void three(ActionEvent e) {
        gui.addWholeNumberToText("3");
        display();
    }

    public void four(ActionEvent e) {
        gui.addWholeNumberToText("4");
        display();
    }

    public void five(ActionEvent e) {
        gui.addWholeNumberToText("5");
        display();
    }

    public void six(ActionEvent e) {
        gui.addWholeNumberToText("6");
        display();
    }

    public void seven(ActionEvent e) {
        gui.addWholeNumberToText("7");
        display();
    }

    public void eight(ActionEvent e) {
        gui.addWholeNumberToText("8");
        display();
    }

    public void nine(ActionEvent e) {
        gui.addWholeNumberToText("9");
        display();
    }

    public void clear(ActionEvent e) {
        gui.clear();
        display();
    }

    public void equal(ActionEvent e) {
        gui.setVal2();
        operation();
        gui.toFirstValue();
    }

    public void operation() {
        switch (operationType) {
            case PLUS:
                gui.add();
                System.out.println("made the addition");
                break;
            case MINUS:
                gui.subtract();
                System.out.println("made the subtraction");
                break;
            case DIVIDE:
                gui.divide();
                System.out.println("made the division");
                break;
            case MULTIPLY:
                gui.multiply();
                System.out.println("made the multiplication");
                break;
            case SQRT:
                gui.sqrt();
                System.out.println("made the sqrt");
                break;
            default:
                throw new IllegalArgumentException();

        }
        display();
    }

    public void plus(ActionEvent e) {
        operationType = Operations.PLUS;
        System.out.println(operationType.toString());
        gui.setVal1();
        gui.clear();
        gui.toSecondValue();
    }

    public void minus(ActionEvent e) {
        operationType = Operations.MINUS;
        System.out.println(operationType.toString());
        gui.setVal1();
        gui.clear();
        gui.toSecondValue();
    }

    public void divide(ActionEvent e) {
        operationType = Operations.DIVIDE;
        System.out.println(operationType.toString());
        gui.setVal1();
        gui.clear();
        gui.toSecondValue();
    }

    public void multiply(ActionEvent e) {
        operationType = Operations.MULTIPLY;
        System.out.println(operationType.toString());
        gui.setVal1();
        gui.clear();
        gui.toSecondValue();
    }

    public void sqrt(ActionEvent e) {
        operationType = Operations.SQRT;
        gui.setVal1();
        gui.clear();
        operation();
    }

    public void display() {
        gui.numberChecker();
        ta.setText(gui.getStringBuilder().toString());
    }


    public void ce(ActionEvent e) {
        gui.clean();
        display();
        System.out.println("Cleared everything");
    }


}
