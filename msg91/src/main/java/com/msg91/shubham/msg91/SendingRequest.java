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

public class SendingRequest {
    protected static void sendRequest(Context context, String request, final ResponseListener listener) {
        Send send = new Send();
        send.sendSmsRequest(context, request, listener);
    }

    private static class Send {
        private void sendSmsRequest(final Context context, final String request, final ResponseListener listener) {
            JsonObjectRequest jsonArrayRequest = new JsonObjectRequest(Request.Method.GET, request, null, new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {
                    try {
                        String type = response.getString("type");
                        String message = response.getString("message");
                        if (!type.equals("success")) {
                            String code = response.getString("code");
                            SMSError smsError = new SMSError(type, message, code);
                            listener.onFailure(smsError);
                        } else {
                            listener.onSuccess("Success");
                        }
                    } catch (JSONException e) {
                    }

                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    listener.onServerError(error.toString());

                }
            });

            RequestQueue re = Volley.newRequestQueue(context);
            re.add(jsonArrayRequest);
        }
    }
}
