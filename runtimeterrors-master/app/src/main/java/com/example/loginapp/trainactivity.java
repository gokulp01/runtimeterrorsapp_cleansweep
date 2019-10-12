package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class trainactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainactivity);
        String url="https://www.ndtv.com/indian-railway/udupi-ud-station";
        WebView web=(WebView) findViewById(R.id.webViewtrain);
        web.loadUrl(url);
    }
}
