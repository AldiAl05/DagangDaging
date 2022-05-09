package com.example.dagangdaging;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class DetailProduk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_produk);

        ImageButton btnback = (ImageButton) findViewById(R.id.imgbtndetailprodukback);
        Button btnbeli = (Button) findViewById(R.id.beli);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent In = new Intent(DetailProduk.this, MainActivity.class );
                startActivity(In);
            }
        });
        btnbeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent In = new Intent(DetailProduk. this, checkout.class);
                startActivity(In);
            }
        });
    }
}