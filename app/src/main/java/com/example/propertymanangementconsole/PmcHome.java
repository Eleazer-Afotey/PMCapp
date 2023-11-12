package com.example.propertymanangementconsole;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class PmcHome extends AppCompatActivity {
    private WebView webView;
    private ProgressDialog progDailog;
    Activity activity ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pmc_home);

        webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);

        //load the url
        webView.loadUrl("https://www.beansinc.org");

    }
    }
