package com.example.adams.funforkids;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class SplashActivity extends AppCompatActivity {

    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        new CountDownTimer(5000,5000)
        {
            @Override
            public void onTick(long l)
            {
                progressBar.setVisibility(View.VISIBLE);
            }
            @Override
            public void onFinish()
            {
                progressBar.setVisibility(View.GONE);
                Intent intent = new Intent(getApplicationContext(),PhoneActivity.class);
                startActivity(intent);
                finish();
            }
        }.start();
    }
}