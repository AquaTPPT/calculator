package com.aquatp.calculator.userinterface;

import com.aquatp.calculator.enums.Operations;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class ButtonHandler {

    private Operations actionChecker = Operations.NUMBER;
    private Handler handler;

    @FXML
    private TextArea ta;

    public ButtonHandler() {
        handler = new Handler();
        handler.create();
    }

    // Number buttons

    public void zero(ActionEvent e) {
        checkLastAction();
        handler.addToText("0");
        display();
        setActionChecker(Operations.NUMBER);
    }

    public void one(ActionEvent e) {
        checkLastAction();
        handler.addToText("1");
        display();
        setActionChecker(Operations.NUMBER);
    }

    public void two(ActionEvent e) {
        checkLastAction();
        handler.addToText("2");
        display();
        setActionChecker(Operations.NUMBER);
    }

    public void three(ActionEvent e) {
        checkLastAction();
        handler.addToText("3");
        display();
        setActionChecker(Operations.NUMBER);
    }

    public void four(ActionEvent e) {
        checkLastAction();
        handler.addToText("4");
        display();
        setActionChecker(Operations.NUMBER);
    }

    public void five(ActionEvent e) {
        checkLastAction();
        handler.addToText("5");
        display();
        setActionChecker(Operations.NUMBER);
    }

    public void six(ActionEvent e) {
        checkLastAction();
        handler.addToText("6");
        display();
        setActionChecker(Operations.NUMBER);
    }

    public void seven(ActionEvent e) {
        checkLastAction();
        handler.addToText("7");
        display();
        setActionChecker(Operations.NUMBER);
    }

    public void eight(ActionEvent e) {
        checkLastAction();
        handler.addToText("8");
        display();
        setActionChecker(Operations.NUMBER);
    }

    public void nine(ActionEvent e) {
        checkLastAction();
        handler.addToText("9");
        display();
        setActionChecker(Operations.NUMBER);
    }

    public void dot(ActionEvent e) {
        checkLastAction();
        handler.addToText(".");
        display();
    }

    // operation buttons

    public void equal(ActionEvent e) {
        handler.addToOperation();
        handler.performOperation();
        display();
        handler.clear();
    }

    public void plus(ActionEvent e) {
        handler.addOperation(Operations.PLUS);
        handler.addToOperation();
        if (!handler.getStringBuilder().isEmpty()) {
            handler.clear();
        }
        setActionChecker(Operations.PLUS);
    }

    public void minus(ActionEvent e) {
        handler.addOperation(Operations.MINUS);
        handler.addToOperation();
        if (!handler.getStringBuilder().isEmpty()) {
            handler.clear();
        }
        setActionChecker(Operations.MINUS);
    }

    public void divide(ActionEvent e) {
        handler.addOperation(Operations.DIVIDE);
        handler.addToOperation();
        if (!handler.getStringBuilder().isEmpty()) {
            handler.clear();
        }
        setActionChecker(Operations.DIVIDE);
    }

    public void multiply(ActionEvent e) {
        handler.addOperation(Operations.MULTIPLY);
        handler.addToOperation();
        if (!handler.getStringBuilder().isEmpty()) {
            handler.clear();
        }
        setActionChecker(Operations.MULTIPLY);
    }

    // this is a specific case that needs to be addressed afterward.

    public void sqrt(ActionEvent e) {
        handler.clear();
    }

    public void display() {
        ta.setText(handler.getStringBuilder().toString());
    }

    // clear buttons

    public void clear(ActionEvent e) {
        handler.clear();
        display();
    }

    public void ce(ActionEvent e) {
        handler.clear();
        display();
        System.out.println("Cleared everything");
    }

    public void checkLastAction() {
        if (actionChecker.equals(Operations.EQUALS)) {
            handler.newOperation();
        }
    }

    public void setActionChecker(Operations opType) {
        actionChecker = opType;
    }
}