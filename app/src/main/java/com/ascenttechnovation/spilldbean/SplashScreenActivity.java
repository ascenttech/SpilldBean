package com.ascenttechnovation.spilldbean;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by ADMIN on 20-06-2015.
 */
public class SplashScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Constants.LOG_TAG, Constants.SplashScreenActivity);
        setContentView(R.layout.activity_splash_screen);
        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(SplashScreenActivity.this,LandingActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }
}
