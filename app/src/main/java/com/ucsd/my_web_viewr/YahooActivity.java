/*
    Sina Gharavi
    Android Programming 1
    Assignment 1
 */

package com.ucsd.my_web_viewr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class YahooActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yahoo);

        WebView webViewYahoo = (WebView) findViewById(R.id.webViewYahoo);
        webViewYahoo.setWebChromeClient(new WebChromeClient());
        webViewYahoo.loadUrl("https://www.yahoo.com/");
    }
}
