package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText Name;
    public EditText Password;
    public TextView Info;
    public Button Login,button1;
    public int count=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Name=(EditText)findViewById(R.id.etName);
        Password=(EditText)findViewById(R.id.etPassword);
        Info=(TextView)findViewById(R.id.tvInfo);
        Login=(Button)findViewById(R.id.btnLogin);
        button1 = (Button) findViewById(R.id.buttonnotify);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        Info.setText("No. of attempts remaining : 3");
        Login.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               validate(Name.getText().toString(),Password.getText().toString());
           }


        });

    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    private void validate(String userName, String userPassword){
        if((userName.equals("runtimeterrors")) && (userPassword.equals("1234"))){

            Intent intent= new Intent(this, splashscreen.class);
            startActivity(intent);


        }
        else if((userName.equals("AravindKarthik")) && (userPassword.equals("minions555"))){

            Intent intent= new Intent(this, splashscreen.class);
            startActivity(intent);}
        else if((userName.equals("Gokul")) && (userPassword.equals("gokul"))){

            Intent intent= new Intent(this, splashscreen.class);
            startActivity(intent);}
        else if((userName.equals("Shivam")) && (userPassword.equals("shivam"))){

            Intent intent= new Intent(this, splashscreen.class);
            startActivity(intent);}
        else if((userName.equals("Ujwal")) && (userPassword.equals("ujwal"))){

            Intent intent= new Intent(this, splashscreen.class);
            startActivity(intent);}

        else{
            count--;

            Info.setText("No of attempts remaining: " + String.valueOf(count));
            if(count==0){
                Login.setEnabled(false);

            }

        }

    }
}
