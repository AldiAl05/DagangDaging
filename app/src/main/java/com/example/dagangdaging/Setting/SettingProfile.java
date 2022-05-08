package com.example.dagangdaging.Setting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.dagangdaging.MainActivity;
import com.example.dagangdaging.R;

public class SettingProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_profile);

        ImageButton btnback = (ImageButton) findViewById(R.id.imgbtnprofileback);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent In = new Intent(SettingProfile.this, MainActivity.class );
                startActivity(In);
            }
        });
    }

}