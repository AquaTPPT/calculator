package com.aquatp.calculator;

import javafx.scene.text.Text;
import javafx.util.converter.NumberStringConverter;

public class GUI {
    private NumberStringConverter numberStringConverter;
    private Text text;
    private Operations operations;
    private StringBuilder stringBuilder;


    public void create() {
        text = new Text();
        numberStringConverter = new NumberStringConverter();
    }


}
