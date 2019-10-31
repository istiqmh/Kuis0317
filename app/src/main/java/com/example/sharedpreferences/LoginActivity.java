package com.example.sharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText user, pass;
    Button mBtn_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = findViewById(R.id.edit_user);
        pass = findViewById(R.id.edit_pass);
        mBtn_login = findViewById(R.id.btn_login);


        login();

        if(SharedPref.getInstance(LoginActivity.this).isLogin()){
            startActivity(new Intent(this, HomeActivity.class));
        }
    }


    public void login() {
        mBtn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = user.getText().toString();
                String e = pass.getText().toString();
                if (n.equals("admin") && e.equals("admin123")){
                    Toast.makeText(getApplicationContext(), "Success Login", Toast.LENGTH_SHORT).show();
                    SharedPref.getInstance(LoginActivity.this).setName(n);
                    SharedPref.getInstance(LoginActivity.this).setLogin(true);

                    startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                }else {
                    Toast.makeText(getApplicationContext(), "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}