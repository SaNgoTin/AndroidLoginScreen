package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        password = findViewById(R.id.password);
        username = findViewById(R.id.username);
    }

    public void logIn(View view){
        if(username.getText().toString().equals("admin")&& password.getText().toString().equals("12345")){
            Toast.makeText(getApplicationContext(),"Login successful",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(),"Login failed",Toast.LENGTH_SHORT).show();
        }
    }
}