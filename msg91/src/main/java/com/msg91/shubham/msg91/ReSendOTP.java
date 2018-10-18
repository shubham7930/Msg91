package com.msg91.shubham.msg91;

import android.content.Context;

/**
 * This class is use to resend the OTP.
 */
public class ReSendOTP {
    /**
     * This method is use to resend the OTP through SMS.
     *
     * @param context  Current Context
     * @param AuthKey  Authentication key which is provided by MSG91.com
     * @param Mobile   Mobile number of the receiver of the message. Separate the number with <b>,</b> if the receiver is more than one.
     * @param listener Callback interface to return the response or error
     */

    public static void sendSMS(Context context, String AuthKey, String Mobile, OtpResponseListener listener) {
        String url = ServerHelper.ResendOTPURL() + "?authkey=" + AuthKey + "&mobile=" + Mobile + "&retrytype=text";
        SMSOtpSendingRequest.sendRequest(context, url, listener);
    }

    /**
     * This method is use to resend the OTP through call.
     *
     * @param context  Current Context
     * @param AuthKey  Authentication key which is provided by MSG91.com
     * @param Mobile   Mobile number of the receiver of the message. Separate the number with <b>,</b> if the receiver is more than one.
     * @param listener Callback interface to return the response or error
     */

    public static void sendCall(Context context, String AuthKey, String Mobile, OtpResponseListener listener) {
        String url = ServerHelper.ResendOTPURL() + "?authkey=" + AuthKey + "&mobile=" + Mobile + "&retrytype=voice";
        SMSOtpSendingRequest.sendRequest(context, url, listener);
    }
}
