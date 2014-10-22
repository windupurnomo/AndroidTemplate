package com.windupurnomo.kambingindonesia.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import com.windupurnomo.kambingindonesia.R;


public class Splash extends Activity {
    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this, Login.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
