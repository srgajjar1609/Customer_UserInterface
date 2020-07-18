package com.example.customerui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class my_profile extends AppCompatActivity implements View.OnClickListener{
    Button register_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        register_button = findViewById(R.id.btnregister);
        register_button.setOnClickListener(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Registration");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnregister:
                startActivity(new Intent(my_profile.this,dashboard.class));

        }
    }
}