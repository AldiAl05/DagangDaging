package com.example.dagangdaging.Setting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dagangdaging.MainActivity;
import com.example.dagangdaging.R;

public class SettingLogOut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_log_out);

        Button btncancle = (Button) findViewById(R.id.btncanclelogout);
        btncancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent In = new Intent(SettingLogOut.this, MainActivity.class );
                startActivity(In);
            }
        });
    }
}