package com.dot.kun.jun.duty4;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Space;

import java.util.Locale;

public class SplashActivity extends AppCompatActivity {

    final public int Delay = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                String lang = String.valueOf(Locale.ENGLISH);
                Locale locale = new Locale(lang);
                Locale.setDefault(locale);
                Configuration configuration = new Configuration();
                configuration.locale = locale;

                SplashActivity.this.getResources().updateConfiguration(configuration,
                        SplashActivity.this.getResources().getDisplayMetrics());

                // sudah loading 3 detik pndah intent nyo lai
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();
            }
        },Delay);
    }
}
