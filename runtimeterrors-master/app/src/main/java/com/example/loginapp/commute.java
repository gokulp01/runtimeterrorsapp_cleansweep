package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class commute extends AppCompatActivity {
    public Button B1,B2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commute);
        B1= (Button)findViewById(R.id.B1);
        B2= (Button)findViewById(R.id.B2);
    }
    public void loadWebPage1(View v){
        Intent intent=new Intent(commute.this, trainactivity.class);
        startActivity(intent);
    }




    public void loadWebPage2(View v){
        Intent intent=new Intent(commute.this, busactivity.class);
        startActivity(intent);
    }
    public void toDo(View v) {
        if (v.equals(B1)) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
        if (v.equals(B2)) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
    }
}
