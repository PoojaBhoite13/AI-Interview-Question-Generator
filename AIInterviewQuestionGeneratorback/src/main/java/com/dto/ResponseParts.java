package com.dto;

public class ResponseParts {
    String text;

    public ResponseParts() {
    }

    public ResponseParts(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
