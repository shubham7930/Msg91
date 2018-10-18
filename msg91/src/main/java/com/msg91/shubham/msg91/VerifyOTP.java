package com.msg91.shubham.msg91;

import android.content.Context;

/**
 * This class is use to verify the OTP from MSG91
 */
public class VerifyOTP {

    /**
     * This method is use to verify the OTP.
     *
     * @param context    Current Context
     * @param AuthKey    Authentication key which is provided by MSG91.com
     * @param Mobile     Mobile number in which OTP was sent
     * @param EnteredOTP The OTP which is entered by the user
     * @param listener   Callback interface to return the response or error
     */
    public static void verify(Context context, String AuthKey, String Mobile, String EnteredOTP, OtpResponseListener listener) {
        String url = ServerHelper.VerifyOTPURL() + "?authkey=" + AuthKey + "&mobile=" + Mobile + "&otp=" + EnteredOTP;
        SMSOTPVerificationRequest.sendRequest(context, url, listener);
    }
}
