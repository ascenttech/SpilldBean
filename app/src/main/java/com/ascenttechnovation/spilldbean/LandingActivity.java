package com.ascenttechnovation.spilldbean;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by ADMIN on 23-06-2015.
 */
public class LandingActivity extends Activity {
    private WebView mWebView;
    String url = "http://spilldbean.com/";
    WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Constants.LOG_TAG,Constants.LandingActivity);
        setContentView(R.layout.activity_landing);
        mWebView = (WebView) findViewById(R.id.webview);
        webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl(url);

        // just check
    }

    @Override
    public void onBackPressed() {

    }
}