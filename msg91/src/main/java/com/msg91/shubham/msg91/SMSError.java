package com.msg91.shubham.msg91;

public class SMSError {
    String type, message, code;

    SMSError(String type, String message, String code) {
        this.code = code;
        this.message = message;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public String getErrorCode() {
        return code;
    }
}
