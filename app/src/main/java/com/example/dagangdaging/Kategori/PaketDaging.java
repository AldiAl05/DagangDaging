package com.example.dagangdaging.Kategori;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagangdaging.MainActivity;
import com.example.dagangdaging.R;

public class PaketDaging extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paket_daging);

        ImageButton btnback = (ImageButton) findViewById(R.id.imgbtnpdback);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent In = new Intent(PaketDaging.this, MainActivity.class );
                startActivity(In);
            }
        });
    }
}