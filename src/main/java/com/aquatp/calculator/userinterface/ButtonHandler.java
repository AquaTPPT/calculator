package com.aquatp.calculator.userinterface;

import com.aquatp.calculator.enums.Operations;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class ButtonHandler {

    private Operations operationType, lastOperationPressed;
    private GUI gui;

    @FXML
    private TextArea ta;

    public ButtonHandler() {
        gui = new GUI();
        gui.create();
    }

    // Number buttons

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



    // operation buttons

    public void equal(ActionEvent e) {
        lastOperationPressed = Operations.EQUALS;
        gui.setVal2();
        operation();
        gui.toFirstValue();
        gui.clear();
    }

    public void plus(ActionEvent e) {
        operationType = Operations.PLUS;
        operationTypeChecker();
        lastOperationPressed = Operations.PLUS;
    }

    public void minus(ActionEvent e) {
        operationType = Operations.MINUS;
        operationTypeChecker();
        lastOperationPressed = Operations.MINUS;
    }

    public void divide(ActionEvent e) {
        operationType = Operations.DIVIDE;
        operationTypeChecker();
        lastOperationPressed = Operations.DIVIDE;
    }

    public void multiply(ActionEvent e) {
        operationType = Operations.MULTIPLY;
        operationTypeChecker();
        lastOperationPressed = Operations.MULTIPLY;
    }

    // this is a specific case that needs to be addressed afterward.

    public void sqrt(ActionEvent e) {
        operationType = Operations.SQRT;
        lastOperationPressed = Operations.SQRT;
        gui.setVal1();
        gui.clear();
        operation();
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

    public void display() {
        gui.cleanStringBuilder();
        ta.setText(gui.getStringBuilder().toString());
    }

    // clear buttons

    public void clear(ActionEvent e) {
        gui.clear();
        display();
    }

    public void ce(ActionEvent e) {
        gui.clean();
        display();
        System.out.println("Cleared everything");
    }



    public void operationTypeChecker() {
        if (lastOperationPressed == Operations.EQUALS) {
            System.out.println("last operation was an equal!");
            gui.setResultToVal1();
            gui.toSecondValue();
        }
        else {
            gui.setVal1();
        }
        gui.clear();
    }
}