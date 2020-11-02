package com.example.oop05102020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Tạo ra 1 instance (Tạo ra 1 cá thể)
        Animal meo = new Animal();
        meo.name = "Doremon";
        meo.weight = 5;
    }
}