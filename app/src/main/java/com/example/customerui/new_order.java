package com.example.customerui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class new_order extends AppCompatActivity implements View.OnClickListener {
    Button placeorder_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_order);
        placeorder_button = findViewById(R.id.btnplaceorder);
        placeorder_button.setOnClickListener(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("New Order");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnplaceorder:
                startActivity(new Intent(new_order.this,payment_activity.class));

        }
    }
}