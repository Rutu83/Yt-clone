package com.youtube.ytclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {


    private static final int splash_out = 3000;
    LottieAnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animationView = findViewById(R.id.LottieAnim);

        new Handler().postDelayed(() -> {

            startActivity(new Intent(getApplicationContext(),WebView.class));
            finish();
        }, splash_out);

    }
}