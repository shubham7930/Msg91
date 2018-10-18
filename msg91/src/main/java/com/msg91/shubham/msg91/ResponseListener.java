package com.msg91.shubham.msg91;

/**
 * <b>Callback interface to return the response or error</b>
 */
public interface ResponseListener {
    /**
     * This method returns if the request is successful.
     *
     * @param response it stores the response.
     */
    void onSuccess(String response);

    /**
     * This method returns if the request is failed.
     *
     * @param error it stores the error message
     */
    void onFailure(SMSError error);

    /**
     * This method returns if the request is failed because of the network or server.
     *
     * @param error it stores the error message
     */
    void onServerError(String error);

}