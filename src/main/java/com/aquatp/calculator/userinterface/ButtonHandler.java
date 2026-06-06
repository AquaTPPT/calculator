package com.aquatp.calculator.userinterface;

import com.aquatp.calculator.enums.Operations;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.NodeOrientation;
import javafx.scene.control.Label;

public class ButtonHandler {

    @FXML
    private Label label;
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
    }

    public void equal(ActionEvent e) { operation();}

    public void operation() {
        switch (operationType) {
            case PLUS:
                gui.add();
                break;
            case MINUS:
                gui.subtract();
                break;
            case DIVIDE:
                gui.divide();
                break;
            case MULTIPLY:
                gui.multiply();
                break;
            case SQRT:
                gui.sqrt();
                break;
            default:
                throw new IllegalArgumentException();

        }
    }

    public void plus(ActionEvent e) {
        operationType = Operations.PLUS;
    }

    public void minus(ActionEvent e) {
        operationType = Operations.MINUS;
    }

    public void divide (ActionEvent e) {
        operationType = Operations.DIVIDE;
    }

    public void multiply(ActionEvent e) {
        operationType = Operations.MULTIPLY;
    }

    public void display() {
        label.setText(gui.getStringBuilder().toString());
    }

    public void sqrt(ActionEvent e) {
        operationType = Operations.SQRT;
    }

    public void ce(ActionEvent e) {
        System.out.println("Cleared everything");
    }


}
