package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class emergency extends AppCompatActivity {

    public Button button1, button2, button3, button4, button5, button6, button7, button8, button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        button1 = (Button) findViewById(R.id.buttonnotify);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo(v);
            }
        });

    }
    public void toDo(View v){
        if(v.equals(button1)){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(("tel:8202923153")));
            startActivity(intent);
        }
        if(v.equals(button2)){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(("tel:9945670912")));
            startActivity(intent);
        }
        if(v.equals(button3)){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(("tel:8202922331")));
            startActivity(intent);
        }
        if(v.equals(button4)){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(("tel:0820-2521275")));
            startActivity(intent);
        }
        if(v.equals(button5)){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(("tel:0820-2534777")));
            startActivity(intent);
        }
        if(v.equals(button6)){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(("tel:100")));
            startActivity(intent);
        }
        if(v.equals(button7)){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(("tel:108")));
            startActivity(intent);
        }
        if(v.equals(button8)){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(("tel:101")));
            startActivity(intent);
        }
        if(v.equals(button9)){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(("tel:9845083869")));
            startActivity(intent);
        }
    }
}
