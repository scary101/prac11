package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonFrameAnimation = findViewById(R.id.buttonFrameAnimation);
        Button buttonTweenAnimation = findViewById(R.id.buttonTweenAnimation);

        buttonFrameAnimation.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Frame.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slideright, R.anim.slideleft);
        });

        buttonTweenAnimation.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Tween.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slideright, R.anim.slideleft);
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slideright, R.anim.slideleft);
    }
}