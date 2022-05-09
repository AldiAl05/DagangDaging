package com.example.dagangdaging.Kategori;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagangdaging.MainActivity;
import com.example.dagangdaging.R;

public class DagingSteak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daging_steak);

        ImageButton btnback = (ImageButton) findViewById(R.id.imgbtndsback);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent In = new Intent(DagingSteak.this, MainActivity.class );
                startActivity(In);
            }
        });
    }
}