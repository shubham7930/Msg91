package com.msg91.shubham.msg91;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class EmailOTPSendingRequest {
    protected static void sendRequest(Context context, String request, final OtpResponseListener callBack) {
        Send send = new Send();
        send.sendRequest(context, request, callBack);
    }

    private static class Send {
        private void sendRequest(final Context context, final String request, final OtpResponseListener callBack) {
            JsonObjectRequest jsonArrayRequest = new JsonObjectRequest(Request.Method.GET, request, null, new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {
                    try {
                        String message = response.getString("msg");
                        if (!message.equals("OTP send successfully")) {
                            callBack.onFailure(message);
                        } else {
                            callBack.onSuccess("Success");
                        }
                    } catch (JSONException e) {
                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    callBack.onServerError(error.toString());
                }
            });
            RequestQueue re = Volley.newRequestQueue(context);
            re.add(jsonArrayRequest);
        }
    }
}
