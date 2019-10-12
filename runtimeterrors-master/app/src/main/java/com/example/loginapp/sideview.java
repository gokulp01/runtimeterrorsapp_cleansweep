package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sideview extends AppCompatActivity {
   public Button B1,B2,B3,B4,B5,B6,B7,B8,B9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sideview);
            B1= (Button)findViewById(R.id.B1);
            B2= (Button)findViewById(R.id.B2);
            B3= (Button)findViewById(R.id.B3);
            B4= (Button)findViewById(R.id.B4);
            B5= (Button)findViewById(R.id.B5);
            B6= (Button)findViewById(R.id.B6);
            B7= (Button)findViewById(R.id.B7);
            B8= (Button)findViewById(R.id.B8);
            B9= (Button)findViewById(R.id.B9);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });


    }
//    public void hostevent(View v){
//        Intent intent=new Intent(sideview.this, Notification.class);
//        startActivity(intent);
//    }


    public void toDo(View v)
        {
            if(v.equals (B1)){
                Intent intent = new Intent( sideview.this,SecondActivity.class);
                startActivity(intent);
            }
            if(v.equals(B2)){
                Intent intent = new Intent(sideview.this,Profile.class);
                startActivity(intent);
            }
            if(v.equals(B3)){
                Intent intent = new Intent(sideview.this,Points.class);
                startActivity(intent);
            }
            if(v.equals(B4)){
                Intent intent = new Intent(sideview.this,Achive.class);
                startActivity(intent);
            }
            if(v.equals(B5)) {
                Intent intent = new Intent(sideview.this, AbtUs.class);
                startActivity(intent);
            }
            if(v.equals(B6)) {
                Intent intent = new Intent(sideview.this, Feedback.class);
                startActivity(intent);
            }
            if(v.equals(B7)){
                Intent intent = new Intent(sideview.this, MainActivity.class);
                startActivity(intent);
            }
            if(v.equals(B8)){
                Intent intent = new Intent(sideview.this, Donate.class);
                startActivity(intent);
            }
           if(v.equals(B9)){
               Intent intent = new Intent(sideview.this, Notification.class);
               startActivity(intent);
           }

        }
    }
