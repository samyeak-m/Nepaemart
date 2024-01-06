package com.webview.nepaemart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView Web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Web = findViewById(R.id.Web);
        Web.setWebViewClient(new WebViewClient());
        Web.getSettings().setJavaScriptEnabled(true);
        Web.loadUrl("https://www.nepaemart.com/");
    }
}