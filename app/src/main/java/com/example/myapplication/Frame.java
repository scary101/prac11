package com.example.myapplication;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Frame extends AppCompatActivity {

    private ImageView imageView;
    private AnimationDrawable frameAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        imageView = findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.animation_rabbit);

        frameAnimation = (AnimationDrawable) imageView.getDrawable();

        Button buttonStart = findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(v -> {
            if(!frameAnimation.isRunning()) {
                frameAnimation.start();
            }
        });

        Button buttonStop = findViewById(R.id.buttonStop);
        buttonStop.setOnClickListener(v -> {
            if(frameAnimation.isRunning()) {
                frameAnimation.stop();
            }
        });
    }
}