package com.example.shreeganesh.config;


import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.jar.JarException;

//   String url = "https://hamroapi.herokuapp.com/pusers";
public class VolleyAPI extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     /*   RequestQueue requestQueue;
        requestQueue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET,
                "https://hamroapi.herokuapp.com/pusers", (Response.Listener<JSONArray>) response -> {
                    try {
                        Log.d("app", "response" , response.getString(String.format("message",)));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }, (Response.ErrorListener) error -> Log.d("app","mileeyna level"));
        requestQueue.add(jsonArrayRequest);*/
    }
 }
