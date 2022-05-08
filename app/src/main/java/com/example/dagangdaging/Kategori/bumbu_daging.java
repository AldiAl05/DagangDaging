package com.example.dagangdaging.Kategori;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagangdaging.MainActivity;
import com.example.dagangdaging.R;
import com.example.dagangdaging.Setting.SettingAbout;

public class bumbu_daging extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bumbu_daging);
        ImageButton btnback = (ImageButton) findViewById(R.id.imgbtnbdback);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent In = new Intent(bumbu_daging.this, MainActivity.class );
                startActivity(In);
            }
        });
    }
}