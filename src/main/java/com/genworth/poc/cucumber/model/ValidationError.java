package com.genworth.poc.cucumber.model;

public class ValidationError {

    private String message;

    private String field;

    public ValidationError(String message) {
        this.message = message;
    }

    public ValidationError(String message, String field) {
        this.message = message;
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
