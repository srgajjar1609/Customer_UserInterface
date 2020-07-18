package com.example.customerui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login_activity extends AppCompatActivity implements View.OnClickListener {
    Button login_to_dashboard_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);
        login_to_dashboard_login = findViewById(R.id.btnlogintodashboard);
        login_to_dashboard_login.setOnClickListener(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("LogIn");

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnlogintodashboard:
                startActivity(new Intent(login_activity.this,dashboard.class));
                break;
        }
    }
}