package com.example.zhangwenpurdue.realestate;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_Splash_Screen extends AppCompatActivity{
    private int splashInterval = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_layout);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Activity_Splash_Screen.this, MainActivity.class);
                startActivity(intent);
                this.finish();
            }
            private void finish() {

            }
        }, splashInterval);

    }
}
