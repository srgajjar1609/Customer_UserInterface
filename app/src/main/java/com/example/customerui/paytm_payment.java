package com.example.customerui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class paytm_payment extends AppCompatActivity implements View.OnClickListener{
    Button button_paytm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paytm_payment);
        button_paytm = findViewById(R.id.btnpaytm);
        button_paytm.setOnClickListener(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Payment");
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnpaytm:
                Toast.makeText(getBaseContext(), "Payment Sucessfull!!" , Toast.LENGTH_SHORT ).show();
                startActivity(new Intent(paytm_payment.this,dashboard.class));
                break;

        }
    }
}