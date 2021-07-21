package com.juncture.backend.error;

public class RestErrorFormat {
    String errorMessage;
    String field;
    public RestErrorFormat(String errorMessage, String field) {
        this.errorMessage = errorMessage;
        this.field = field;
    }
    public RestErrorFormat() {
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
