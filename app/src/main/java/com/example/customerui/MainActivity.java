package com.example.customerui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button forward_button;
    Button login_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        forward_button = findViewById(R.id.btnforward);
        forward_button.setOnClickListener(this);

        login_button =  findViewById(R.id.btnlogin);
        login_button.setOnClickListener(this);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Customer");

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.btnforward:
                startActivity(new Intent(MainActivity.this,verification_otp.class));
                break;
            case R.id.btnlogin:
                startActivity(new Intent(MainActivity.this,login_activity.class));
                break;

        }
    }
}