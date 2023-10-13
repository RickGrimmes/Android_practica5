package com.example.conversion_practica5;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class splasher extends AppCompatActivity {

    CountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splasher);

        final ImageView animationView = findViewById(R.id.animationViews);

        // Animación de opacidad
        ObjectAnimator alpha = ObjectAnimator.ofFloat(animationView, "alpha", 0f, 1f);

        // Duración de animación
        alpha.setDuration(2000);

        // Animación start :D
        alpha.start();

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent(splasher.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(tarea, 5000);
    }
}