package com.example.customerui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashboard extends AppCompatActivity implements View.OnClickListener {
    Button order_history_button,order_active_button,new_order_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        order_history_button = findViewById(R.id.btnorderhistory);
        order_history_button.setOnClickListener(this);

        order_active_button = findViewById(R.id.btnactiveorders);
        order_active_button.setOnClickListener(this);

        new_order_button = findViewById(R.id.btnneworder);
        new_order_button.setOnClickListener(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Dashboard");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnorderhistory:
                startActivity(new Intent(dashboard.this,order_history.class));
                break;
            case R.id.btnactiveorders:
                startActivity(new Intent(dashboard.this,active_order.class));
                break;
            case R.id.btnneworder:
                startActivity(new Intent(dashboard.this,new_order.class));
                break;
        }
    }
}