package com.example.customerui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class verification_otp extends AppCompatActivity implements View.OnClickListener {
    Button btn_verify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_otp);

        btn_verify =  findViewById(R.id.btnverifyotp);
        btn_verify.setOnClickListener(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Verification");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnverifyotp:
                startActivity(new Intent(verification_otp.this,my_profile.class));
                break;
        }
    }
}