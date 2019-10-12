package com.example.commute;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


            public void loadWebPage1(View v){
            Intent intent=new Intent(MainActivity.this, trainActivity.class);
                startActivity(intent);
        }




            public void loadWebPage2(View v){
                Intent intent=new Intent(MainActivity.this, busactivity.class);
                startActivity(intent);
            }









    }

