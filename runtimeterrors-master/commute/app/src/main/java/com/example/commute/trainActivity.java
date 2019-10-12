package com.example.commute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class trainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train);
        String url="https://www.ndtv.com/indian-railway/udupi-ud-station";
        WebView web=(WebView) findViewById(R.id.webView);
        web.loadUrl(url);

    }
}
