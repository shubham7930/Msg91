package com.msg91.shubham.msg91;

import android.content.Context;

/**
 * This class is used to send OTP through E-Mail
 */
public class SendEmailOTP {

    /**
     * This method is use to send OTP through E-Mail.
     *
     * @param context  Current Context
     * @param AuthKey  Authentication key which is provided by MSG91.com
     * @param Email    Email Id of the receiver of the OTP
     * @param OTP      The OTP which you want to send
     * @param listener Callback interface to return the response or error
     */
    public static void send(Context context, String AuthKey, String Email, String OTP, OtpResponseListener listener) {
        String Url = ServerHelper.sendEmailOTPURL() + "?otp=" + OTP + "&email=" + Email + "&authkey=" + AuthKey;
        EmailOTPSendingRequest.sendRequest(context, Url, listener);
    }

    /**
     * @param context    Current Context
     * @param AuthKey    Authentication key which is provided by MSG91.com
     * @param Email      Email Id of the receiver of the OTP
     * @param OTP        The OTP which you want to send
     * @param TemplateID Template ID which can be create thorugh MSG91 dashboard.
     * @param listener   Callback interface to return the response or error
     */
    public static void sendWithTemplate(Context context, String AuthKey, String Email, String OTP, int TemplateID, OtpResponseListener listener) {
        String Url = ServerHelper.sendEmailOTPURL() + "?otp=" + OTP + "&email=" + Email + "&authkey=" + AuthKey + "&template=" + TemplateID;
        EmailOTPSendingRequest.sendRequest(context, Url, listener);
    }

    /**
     * @param context  Current Context
     * @param AuthKey  Authentication key which is provided by MSG91.com
     * @param Email    Email Id of the receiver of the OTP
     * @param OTP      The OTP which you want to send
     * @param Minute   Minute after which the OTP will expiry
     * @param listener Callback interface to return the response or error
     */
    public static void sendWithExpiry(Context context, String AuthKey, String Email, String OTP, int Minute, OtpResponseListener listener) {
        String Url = ServerHelper.sendEmailOTPURL() + "?otp=" + OTP + "&email=" + Email + "&authkey=" + AuthKey + "&expiry=" + Minute;
        EmailOTPSendingRequest.sendRequest(context, Url, listener);
    }

    /**
     * @param context    Current Context
     * @param AuthKey    Authentication key which is provided by MSG91.com
     * @param Email      Email Id of the receiver of the OTP
     * @param OTP        The OTP which you want to send
     * @param TemplateID Template ID which can be create thorugh MSG91 dashboard.
     * @param Minute     Minute after which the OTP will expiry
     * @param listener   Callback interface to return the response or error
     */
    public static void sendWithTemplateAndExpiry(Context context, String AuthKey, String Email, String OTP, int TemplateID, int Minute, OtpResponseListener listener) {
        String Url = ServerHelper.sendEmailOTPURL() + "?otp=" + OTP + "&email=" + Email + "&authkey=" + AuthKey + "&template=" + TemplateID + "&expiry=" + Minute;
        EmailOTPSendingRequest.sendRequest(context, Url, listener);
    }

}
