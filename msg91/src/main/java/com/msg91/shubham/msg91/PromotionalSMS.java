package com.msg91.shubham.msg91;

import android.content.Context;

/**
 * <b>This class is use to send Promotional SMS using MSG91 Platform</b>
 */


public class PromotionalSMS {

    /**
     * This method is use to send Promotional sms instantly.
     *
     * @param context          Current Context
     * @param AuthKey          Authentication key which is provided by MSG91.com
     * @param MobileNumber     Mobile number of the receiver of the message. Separate the number with <b>,</b> if the receiver is more than one.
     * @param Message          Message which you want to send
     * @param SenderID         Sender Id which you want to send the message from. Example - MSGIND
     * @param CountryCode      Country code of the receiver (India 91)
     * @param responseListener Callback interface to return the response or error
     */
    public static void sendNow(final Context context, String AuthKey, String MobileNumber, String Message, String SenderID, int CountryCode, final ResponseListener responseListener) {
        String Url = ServerHelper.sendSMSURL() + "?message=" + Message + "&authkey=" + AuthKey + "&mobiles=" + MobileNumber + "&route=1&sender=" + SenderID + "&country=" + CountryCode;
        sendSMSRequest(context, Url, responseListener);
    }

    /**
     * This method is use to send Promotional sms with specific delay which is specified by minute.
     *
     * @param context          Current Context
     * @param AuthKey          Authentication key which is provided by MSG91.com
     * @param MobileNumber     Mobile number of the receiver of the message. Separate the number with <b>,</b> if the receiver is more than one.
     * @param Message          Message which you want to send
     * @param SenderID         Sender Id which you want to send the message from. Example - MSGIND
     * @param CountryCode      Country code of the receiver (India 91)
     * @param DelayInMinute    Send the message after delay of given minute.
     * @param responseListener Callback interface to return the response or error
     */

    public static void sendLater(final Context context, String AuthKey, String MobileNumber, String Message, String SenderID, int CountryCode, int DelayInMinute, final ResponseListener responseListener) {
        String Url = ServerHelper.sendSMSURL() + "?afterminutes=" + DelayInMinute + "&message=" + Message + "&authkey=" + AuthKey + "&mobiles=" + MobileNumber + "&route=1&sender=" + SenderID + "&country=" + CountryCode;
        sendSMSRequest(context, Url, responseListener);
    }

    /**
     * This method is use to send Promotional sms at specific time.
     *
     * @param context          Current Context
     * @param AuthKey          Authentication key which is provided by MSG91.com
     * @param MobileNumber     Mobile number of the receiver of the message. Separate the number with <b>,</b> if the receiver is more than one.
     * @param Message          Message which you want to send
     * @param SenderID         Sender Id which you want to send the message from. Example - MSGIND
     * @param CountryCode      Country code of the receiver (India 91)
     * @param time             (Time - Y-m-d h:i:s (2020-01-01 10:10:00) Or Y/m/d h:i:s (2020/01/01 10:10:00) Or you can send unix timestamp (1577873400))
     * @param responseListener Callback interface to return the response or error
     */

    public static void sendSchedule(final Context context, String AuthKey, String MobileNumber, String Message, String SenderID, int CountryCode, String time, final ResponseListener responseListener) {
        String Url = ServerHelper.sendSMSURL() + "?schtime=" + time + "&message=" + Message + "&authkey=" + AuthKey + "&mobiles=" + MobileNumber + "&route=1&sender=" + SenderID + "&country=" + CountryCode;
        sendSMSRequest(context, Url, responseListener);
    }

    /**
     * This method is use to send flash Promotional sms instantly.
     *
     * @param context          Current Context
     * @param AuthKey          Authentication key which is provided by MSG91.com
     * @param MobileNumber     Mobile number of the receiver of the message. Separate the number with <b>,</b> if the receiver is more than one.
     * @param Message          Message which you want to send
     * @param SenderID         Sender Id which you want to send the message from. Example - MSGIND
     * @param CountryCode      Country code of the receiver (India 91)
     * @param responseListener Callback interface to return the response or error
     */
    public static void sendFlash(final Context context, String AuthKey, String MobileNumber, String Message, String SenderID, int CountryCode, final ResponseListener responseListener) {
        String Url = ServerHelper.sendSMSURL() + "?flash=1&message=" + Message + "&authkey=" + AuthKey + "&mobiles=" + MobileNumber + "&route=1&sender=" + SenderID + "&country=" + CountryCode;
        sendSMSRequest(context, Url, responseListener);
    }

    /**
     * This method is use to send flash Promotional sms with specific delay which is specified by minute.
     *
     * @param context          Current Context
     * @param AuthKey          Authentication key which is provided by MSG91.com
     * @param MobileNumber     Mobile number of the receiver of the message. Separate the number with <b>,</b> if the receiver is more than one.
     * @param Message          Message which you want to send
     * @param SenderID         Sender Id which you want to send the message from. Example - MSGIND
     * @param CountryCode      Country code of the receiver (India 91)
     * @param DelayInMinute    Send the message after delay of given minute.
     * @param responseListener Callback interface to return the response or error
     */

    public static void sendFlashLater(final Context context, String AuthKey, String MobileNumber, String Message, String SenderID, int CountryCode, int DelayInMinute, final ResponseListener responseListener) {
        String Url = ServerHelper.sendSMSURL() + "?flash=1&afterminutes=" + DelayInMinute + "&message=" + Message + "&authkey=" + AuthKey + "&mobiles=" + MobileNumber + "&route=1&sender=" + SenderID + "&country=" + CountryCode;
        sendSMSRequest(context, Url, responseListener);
    }

    /**
     * This method is use to send flash Promotional sms at specific time.
     *
     * @param context          Current Context
     * @param AuthKey          Authentication key which is provided by MSG91.com
     * @param MobileNumber     Mobile number of the receiver of the message. Separate the number with <b>,</b> if the receiver is more than one.
     * @param Message          Message which you want to send
     * @param SenderID         Sender Id which you want to send the message from. Example - MSGIND
     * @param CountryCode      Country code of the receiver (India 91)
     * @param time             (Time - Y-m-d h:i:s (2020-01-01 10:10:00) Or Y/m/d h:i:s (2020/01/01 10:10:00) Or you can send unix timestamp (1577873400))
     * @param responseListener Callback interface to return the response or error
     */

    public static void sendFlashSchedule(final Context context, String AuthKey, String MobileNumber, String Message, String SenderID, int CountryCode, String time, final ResponseListener responseListener) {
        String Url = ServerHelper.sendSMSURL() + "?flash=1&schtime=" + time + "&message=" + Message + "&authkey=" + AuthKey + "&mobiles=" + MobileNumber + "&route=1&sender=" + SenderID + "&country=" + CountryCode;
        sendSMSRequest(context, Url, responseListener);
    }

    private static void sendSMSRequest(Context context, String Url, final ResponseListener responseListener) {
        SendingRequest.sendRequest(context, Url, responseListener);
    }

}
