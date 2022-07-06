package com.tremend.practice.util.constants.framework;

public enum Attribute {

    HREF("href"),
    VALUE("value");


    private String value;

    Attribute(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
