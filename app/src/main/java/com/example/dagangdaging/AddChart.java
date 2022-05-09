package com.example.dagangdaging;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AddChart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_chart);

        ImageButton btnback = (ImageButton) findViewById(R.id.imgbtnaddchartback);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent In = new Intent(AddChart. this, MainActivity.class);
                startActivity(In);
            }
        });
    }

    public void checkout(View view) {
        Intent checkout= new Intent(AddChart .this, Checkout.class );
        startActivity(checkout);
    }

}