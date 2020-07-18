package com.example.customerui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class payment_activity extends AppCompatActivity implements View.OnClickListener{
    Button button_payment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_activity);
        button_payment = findViewById(R.id.btnpayment);
        button_payment.setOnClickListener(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Pay Bill");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnpayment:
                startActivity(new Intent(payment_activity.this, paytm_payment.class));
                break;
        }
    }
}