package com.example.customerui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class order_history extends AppCompatActivity implements View.OnClickListener{
    Button button_repeate,button_repeate1,button_repeate2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_history);

        button_repeate = findViewById(R.id.btnrepeateorder);
        button_repeate.setOnClickListener(this);

        button_repeate = findViewById(R.id.btnrepeateorder1);
        button_repeate.setOnClickListener(this);

        button_repeate = findViewById(R.id.btnrepeateorder2);
        button_repeate.setOnClickListener(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Order History");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnrepeateorder:
                startActivity(new Intent(order_history.this,payment_activity.class));
                break;
            case R.id.btnrepeateorder1:
                startActivity(new Intent(order_history.this,payment_activity.class));
                break;
            case R.id.btnrepeateorder2:
                startActivity(new Intent(order_history.this,payment_activity.class));
                break;
        }
    }
}