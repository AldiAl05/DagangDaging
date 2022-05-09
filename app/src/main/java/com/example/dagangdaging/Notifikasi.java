package com.example.dagangdaging;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Notifikasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifikasi);

        ImageButton btnback = (ImageButton) findViewById(R.id.imgbtnnotifback);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent In = new Intent(Notifikasi.this, MainActivity.class );
                startActivity(In);
            }
        });
    }
}