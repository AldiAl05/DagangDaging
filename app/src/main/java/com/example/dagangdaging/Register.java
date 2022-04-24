package com.example.dagangdaging;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();
    }

    public void onClickRegistBackToLogin(View view) {
        Intent bckLogin = new Intent(Register.this, Login.class );
        startActivity(bckLogin);
    }
}