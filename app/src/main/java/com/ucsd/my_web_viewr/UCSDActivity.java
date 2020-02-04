package com.ucsd.my_web_viewr;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.webkit.WebChromeClient;
        import android.webkit.WebView;

public class UCSDActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yahoo);

        WebView webViewUCSD = (WebView) findViewById(R.id.webViewYahoo);
        webViewUCSD.setWebChromeClient(new WebChromeClient());
        webViewUCSD.loadUrl("https://extension.ucsd.edu/");
    }
}
