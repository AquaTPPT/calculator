package com.aquatp.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ButtonHandler {
    private GUI gui;

    public ButtonHandler() {
        gui = new GUI();
        gui.create();
    }

    @FXML

    public void zero(ActionEvent e) {
        gui.addWholeNumberToText("0");
    }

    public void one(ActionEvent e) {
        gui.addWholeNumberToText("1");
    }

    public void two(ActionEvent e) {
        gui.addWholeNumberToText("2");
    }

    public void three(ActionEvent e) {
        gui.addWholeNumberToText("3");
    }

    public void four(ActionEvent e) {
        gui.addWholeNumberToText("4");
    }

    public void five(ActionEvent e) {
        gui.addWholeNumberToText("5");
    }

    public void six(ActionEvent e) {
        gui.addWholeNumberToText("6");
    }

    public void seven(ActionEvent e) {
        gui.addWholeNumberToText("7");
    }

    public void eight(ActionEvent e) {
        gui.addWholeNumberToText("8");
    }

    public void nine(ActionEvent e) {
        gui.addWholeNumberToText("9");
    }

    public void clear(ActionEvent e) {
        System.out.println("cleared");
    }

    public void ce(ActionEvent e) {
        System.out.println("Cleared everything");
    }
}
