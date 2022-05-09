package com.example.dagangdaging;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.dagangdaging.fragment.FragmentAccount;

public class Register extends AppCompatActivity {
    public static final String regu = "username";
    public static final String rege = "email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }

    public void onClickRegistBackToLogin(View view) {
        Intent bckLogin = new Intent(Register.this, Login.class );
        startActivity(bckLogin);
    }

    public void daftarakun(View view) {
//        Intent intent = new Intent(this, MainActivity.class);
//
//        EditText regpassword= (EditText) findViewById(R.id.EditTextRegistPassword);
//        EditText regConfirmPass = (EditText) findViewById(R.id.EditTextRegistConfirmPassword);
//
//        String pass = regpassword.getText().toString();
//        String conpass = regConfirmPass.getText().toString();
//
//        if (pass.equals("")) {
//            Toast.makeText(this, "Password cannot be null", Toast.LENGTH_SHORT).show();
//        } else {
//            if (!pass.equals(conpass)) {
//                Toast.makeText(this, "Password not same with confirm password", Toast.LENGTH_SHORT).show();
//            } else {
//                startActivity(intent);
//
//            }
//        }
    }
}