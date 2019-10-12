package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    public Button button9,button10,button11,button12,button13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button9 = (Button)findViewById(R.id.button9);
        button10 = (Button)findViewById(R.id.button10);
        button11 = (Button)findViewById(R.id.button11);
        button12 = (Button)findViewById(R.id.button12);
        button13 = (Button)findViewById(R.id.button13);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });


    }
    public void loadWebPage(View v){
        Intent intent=new Intent(this,citynews.class);
        startActivity(intent);



    }
    public void toDo(View v){
        if(v.equals(button9)){
            Intent intent = new Intent(this,postem.class);
            startActivity(intent);
        }
        if(v.equals(button10)){
            Intent intent = new Intent(this,commute.class);
            startActivity(intent);
        }
        if(v.equals(button11)){
            Intent intent = new Intent(this,citynews.class);
            startActivity(intent);
        }
        if(v.equals(button12)){
            Intent intent = new Intent(this,emergency.class);
            startActivity(intent);
        }
        if(v.equals(button13)){
            Intent intent = new Intent(this,sideview.class);
            startActivity(intent);
        }
    }
}
