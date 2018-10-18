package com.msg91.shubham.msg91;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class SMSOtpSendingRequest {

    protected static void sendRequest(Context context, String request, final OtpResponseListener callBack) {
        Send send = new Send();
        send.sendSmsRequest(context, request, callBack);
    }

    private static class Send {
        private void sendSmsRequest(final Context context, final String request, final OtpResponseListener callBack) {
            JsonObjectRequest jsonArrayRequest = new JsonObjectRequest(Request.Method.GET, request, null, new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {
                    try {
                        String type = response.getString("type");
                        String message = response.getString("message");
                        if (!type.equals("success")) {
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
                    Toast.makeText(context, "" + error, Toast.LENGTH_SHORT).show();
                    callBack.onServerError(error.toString());

                }
            });
            RequestQueue re = Volley.newRequestQueue(context);
            re.add(jsonArrayRequest);
        }
    }
}
