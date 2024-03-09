package com.example.semest21;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class WebActivity extends AppCompatActivity {

    private WebView webView;
    private EditText editTextSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = findViewById(R.id.webView);
        editTextSearch = findViewById(R.id.editTextSearch);

        // Настройка WebView
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Разрешить выполнение JavaScript

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.example.com"); // Загрузка веб-страницы
    }

    public void searchOnWebView(View view) {
        String searchText = editTextSearch.getText().toString();
        webView.findAllAsync(searchText);
    }
}