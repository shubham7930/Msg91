package com.msg91.shubham.msg91;

import android.content.Context;

/**
 * This class is use to send the OTP through SMS
 */
public class SendOTP {


    /**
     * This method is use to send auto generated OTP through SMS.
     *
     * @param context  Current Context
     * @param AuthKey  Authentication key which is provided by MSG91.com
     * @param Message  Write the message followed by mentioning ##OTP## in message to place otp value in the message
     * @param SenderID Sender Id which you want to send the message from. Example - MSGIND
     * @param Mobile   Mobile number of the receiver of the message. Separate the number with <b>,</b> if the receiver is more than one.
     * @param listener Callback interface to return the response or error
     */
    public static void sendOTP(Context context, String AuthKey, String Message, String SenderID, String Mobile, OtpResponseListener listener) {
        String mess = Message.replaceAll("##OTP##", "%23%23OTP%23%23");
        String url = ServerHelper.SendOTPURL() + "?authkey=" + AuthKey + "&message=" + mess + "&sender=" + SenderID + "&mobile=" + Mobile;
        SMSOtpSendingRequest.sendRequest(context, url, listener);
    }

    /**
     * This method is use to send custom OTP through SMS
     *
     * @param context  Current Context
     * @param AuthKey  Authentication key which is provided by MSG91.com
     * @param Message  Write the message followed by mentioning ##OTP## in message to place otp value in the message
     * @param SenderID Sender Id which you want to send the message from. Example - MSGIND
     * @param Mobile   Mobile number of the receiver of the message. Separate the number with <b>,</b> if the receiver is more than one.
     * @param OTP      The OTP which you want to send
     * @param listener Callback interface to return the response or error
     */
    public static void sendCustomOTP(Context context, String AuthKey, String Message, String SenderID, String Mobile, String OTP, OtpResponseListener listener) {
        String mess = Message.replaceAll("##OTP##", "%23%23OTP%23%23");
        String url = ServerHelper.SendOTPURL() + "?authkey=" + AuthKey + "&message=" + mess + "&sender=" + SenderID + "&mobile=" + Mobile + "&otp=" + OTP;
        SMSOtpSendingRequest.sendRequest(context, url, listener);
    }

    /**
     * This method is use to send fixed length (varies from 4 to 9) of OTP through SMS.
     *
     * @param context  Current Context
     * @param AuthKey  Authentication key which is provided by MSG91.com
     * @param Message  Write the message followed by mentioning ##OTP## in message to place otp value in the message
     * @param SenderID Sender Id which you want to send the message from. Example - MSGIND
     * @param Mobile   Mobile number of the receiver of the message. Separate the number with <b>,</b> if the receiver is more than one.
     * @param Length   Fixed length of OTP (varies from 4 to 9)
     * @param listener Callback interface to return the response or error
     */
    public static void sendOTPFixedLength(Context context, String AuthKey, String Message, String SenderID, String Mobile, int Length, OtpResponseListener listener) {
        String mess = Message.replaceAll("##OTP##", "%23%23OTP%23%23");
        String url = ServerHelper.SendOTPURL() + "?authkey=" + AuthKey + "&message=" + mess + "&sender=" + SenderID + "&mobile=" + Mobile + "?otp_length=" + Length;
        SMSOtpSendingRequest.sendRequest(context, url, listener);
    }

    /**
     * This method is use to send OTP through SMS with expiry of the OTP after given minutes .
     *
     * @param context  Current Context
     * @param AuthKey  Authentication key which is provided by MSG91.com
     * @param Message  Write the message followed by mentioning ##OTP## in message to place otp value in the message
     * @param SenderID Sender Id which you want to send the message from. Example - MSGIND
     * @param Mobile   Mobile number of the receiver of the message. Separate the number with <b>,</b> if the receiver is more than one.
     * @param Minute   Minute after which the OTP will expiry
     * @param listener Callback interface to return the response or error
     */

    public static void sendOTPWithExpiry(Context context, String AuthKey, String Message, String SenderID, String Mobile, int Minute, OtpResponseListener listener) {
        String mess = Message.replaceAll("##OTP##", "%23%23OTP%23%23");
        String url = ServerHelper.SendOTPURL() + "?authkey=" + AuthKey + "&message=" + mess + "&sender=" + SenderID + "&mobile=" + Mobile + "&otp_expiry=" + Minute;
        SMSOtpSendingRequest.sendRequest(context, url, listener);
    }

    /**
     * This method is use to send custon OTP through SMS with expiry of the OTP after given minutes .
     *
     * @param context  Current Context
     * @param AuthKey  Authentication key which is provided by MSG91.com
     * @param Message  Write the message followed by mentioning ##OTP## in message to place otp value in the message
     * @param SenderID Sender Id which you want to send the message from. Example - MSGIND
     * @param Mobile   Mobile number of the receiver of the message. Separate the number with <b>,</b> if the receiver is more than one
     * @param OTP      The OTP which you want to send
     * @param Minute   Minute after which the OTP will expiry
     * @param listener Callback interface to return the response or error
     */
    public static void sendCustomOTPWithExpriy(Context context, String AuthKey, String Message, String SenderID, String Mobile, String OTP, int Minute, OtpResponseListener listener) {
        String mess = Message.replaceAll("##OTP##", "%23%23OTP%23%23");
        String url = ServerHelper.SendOTPURL() + "?authkey=" + AuthKey + "&message=" + mess + "&sender=" + SenderID + "&mobile=" + Mobile + "&otp=" + OTP + "&otp_expiry=" + Minute;
        SMSOtpSendingRequest.sendRequest(context, url, listener);
    }

    /**
     * This method is use to send fixed length (varies from 4 to 9) of OTP through SMS with expiry of the OTP after given minutes .
     *
     * @param context  Current Context
     * @param AuthKey  Authentication key which is provided by MSG91.com
     * @param Message  Write the message followed by mentioning ##OTP## in message to place otp value in the message
     * @param SenderID Sender Id which you want to send the message from. Example - MSGIND
     * @param Mobile   Mobile number of the receiver of the message. Separate the number with <b>,</b> if the receiver is more than one.
     * @param Length   Fixed length of OTP (varies from 4 to 9)
     * @param Minute   Minute after which the OTP will expiry
     * @param listener Callback interface to return the response or error
     */
    public static void sendOTPFixedLengthWithExpriy(Context context, String AuthKey, String Message, String SenderID, String Mobile, int Length, int Minute, OtpResponseListener listener) {
        String mess = Message.replaceAll("##OTP##", "%23%23OTP%23%23");
        String url = ServerHelper.SendOTPURL() + "?authkey=" + AuthKey + "&message=" + mess + "&sender=" + SenderID + "&mobile=" + Mobile + "?otp_length=" + Length + "&otp_expiry=" + Minute;
        SMSOtpSendingRequest.sendRequest(context, url, listener);
    }
}
