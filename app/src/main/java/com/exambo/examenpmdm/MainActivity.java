package com.exambo.examenpmdm;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.exambo.examenpmdm.databinding.ActivityMainactivityBinding;
import com.exambo.examenpmdm.ui.frmanager.PaginadorMainActivity;


public class MainActivity extends AppCompatActivity {

    SharedPreferences preferences = getSharedPreferences("Usuario", Context.MODE_PRIVATE);
    String name = preferences.getString("user", "");
    String password = preferences.getString("password", "");

    private ActivityMainactivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        PaginadorMainActivity paginador = new PaginadorMainActivity(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(paginador);
    }
}