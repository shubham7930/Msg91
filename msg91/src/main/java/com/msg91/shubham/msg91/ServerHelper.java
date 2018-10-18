package com.msg91.shubham.msg91;

public class ServerHelper {
    protected static String sendSMSURL() {
        return "http://api.msg91.com/api/v2/sendsms";
    }

    protected static String sendEmailOTPURL() {
        return "http://control.msg91.com/api/sendmailotp.php";
    }

    protected static String SendOTPURL() {
        return "http://control.msg91.com/api/sendotp.php";
    }

    protected static String ResendOTPURL() {
        return "http://control.msg91.com/api/retryotp.php";
    }

    protected static String VerifyOTPURL() {
        return "http://control.msg91.com/api/verifyRequestOTP.php";
    }
}

