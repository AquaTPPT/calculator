package com.aquatp.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.converter.NumberStringConverter;



public class GUI {
    private NumberStringConverter numberStringConverter;
    private Label numbers;
    private Operations operations;
    private StringBuilder sb;


    public void create() {
        operations = new Operations();
        numbers = new Label();
        numberStringConverter = new NumberStringConverter();
        sb = new StringBuilder();
    }

    public void addWholeNumberToText(String val) {
        sb.append(val);
        display();
    }

    public void display() {
        System.out.println(sb.toString());
    }

}
