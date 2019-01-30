package com.example.oriin_bsqgiqy.webview_practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2,ed3;
Button btn1,btn2;
WebView wv1;
String str1,str2,str3;
String url = "https://www.google.co.il/search?ei=DXVCXKS6LbHrsgPV-YGYDw&q=";
int a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv1 = findViewById(R.id.wv1);
        wv1.getSettings().setJavaScriptEnabled(true);
        btn1= findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        ed1=findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        ed3 = findViewById(R.id.ed3);

    }

    public void reset(View view) {
        str1 = ed1.getText().toString();
        a = Integer.parseInt(str1);
        str2 = ed2.getText().toString();
        b = Integer.parseInt(str2);
        str3 = ed3.getText().toString();
        c = Integer.parseInt(str3);
        url = "https://www.google.co.il/search?ei=DXVCXKS6LbHrsgPV-YGYDw&q=";
        url = url+a+"x%5E2%2B"+b+"x%2B"+c+"&oq";
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl(url);


    }

    public void calculate(View view) {
    ed1.setText("");
    ed2.setText("");
    ed3.setText("");
    url = "";
    wv1.loadUrl(url);
    }
}
