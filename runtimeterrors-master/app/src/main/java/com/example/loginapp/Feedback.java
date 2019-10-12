package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {
public Button b;
Handler setdelay;
Runnable startdelay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
            b=(Button) findViewById(R.id.button5);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    toDo(v);
                }
            });
    }
    public void toDo(View v){
            if(v.equals(b))
            {

                Toast.makeText(getApplicationContext(),"Thank you for the feedback!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);

                }
        }
        }

