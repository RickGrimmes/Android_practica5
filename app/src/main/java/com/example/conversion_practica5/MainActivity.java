package com.example.conversion_practica5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.conversion_practica5.models.Celsius;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Celsius c= new Celsius(0.0);


    }
}