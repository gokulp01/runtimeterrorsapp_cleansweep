package com.example.webviewnews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        String url="https://www.news18.com/newstopics/udupi.html";
        WebView web=(WebView) findViewById(R.id.webView);
        web.loadUrl(url);


    }
}
