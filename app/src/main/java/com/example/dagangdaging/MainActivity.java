package com.example.dagangdaging;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.os.Bundle;

import com.example.dagangdaging.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        menggantiFragment(new FragmentHome());

        binding.buttonNavigationMenu.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){
                case R.id.home:
                    menggantiFragment(new FragmentHome());
                    break;
                case R.id.discount:
                    menggantiFragment(new FragmentDiscount());
                    break;
                case R.id.transaction:
                    menggantiFragment(new FragmentTransactions());
                    break;
                case R.id.account:
                    menggantiFragment(new FragmentAccount());
                    break;
            }

            return true;
        } );

    }
    private void menggantiFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container,fragment);
        fragmentTransaction.commit();
    }


}