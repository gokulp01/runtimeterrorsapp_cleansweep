package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class busactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busactivity);

        String url1="https://manipalblog.com/manipal-to-mangalore-ksrtc-volvo-timings/";
        WebView web=(WebView) findViewById(R.id.webViewbus);
        web.loadUrl(url1);
    }
}
