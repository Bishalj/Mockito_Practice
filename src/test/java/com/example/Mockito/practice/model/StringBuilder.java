package com.example.Mockito.practice.model;

public class StringBuilder {

    private String text;

    public StringBuilder(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void append(StringBuilder text) {
        this.text += text.getText();
    }
}
