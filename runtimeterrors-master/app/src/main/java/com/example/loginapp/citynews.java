package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class citynews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citynews);
        String url="https://www.news18.com/newstopics/udupi.html";
        WebView web=(WebView) findViewById(R.id.webViewnews);
        web.loadUrl(url);
    }
}
