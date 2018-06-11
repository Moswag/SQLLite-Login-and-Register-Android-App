package com.moswagcytex.samplezark;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LinkedIn extends AppCompatActivity {
    WebView web;
String url="https://www.truelancer.com/freelancer/swimoz";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linked_in);

        web=(WebView)findViewById(R.id.web);
        // Enable Javascript
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);

        web.loadUrl(url);

        // Force links and redirects to open in the WebView instead of in a browser
        web.setWebViewClient(new WebViewClient());
    }


    @Override
    public void onBackPressed() {
        if (web.canGoBack()) {
            web.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
