package hp.counter.com.dropin;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ScrollView;

/**
 * Created by varun on 17-10-2015.
 */
public class SelfLearn extends Activity {
       ScrollView n;

        private class MyWebViewClient extends WebViewClient {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        }

        Button btnBack;
        WebView webview;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            // TODO Auto-generated method stub
            super.onCreate(savedInstanceState);
            setContentView(R.layout.web); //layout name changed

            n=(ScrollView)findViewById(R.id.scrollView2);

            webview = (WebView) findViewById(R.id.webview1);
            webview.setWebViewClient(new MyWebViewClient());
            openURL();
        }

        /**
         * Opens the URL in a browser
         */


        private void openURL() {
            webview.loadUrl("https://www.youtube.com/watch?v=knu_-Lumbog");
           // webview.loadUrl("https://www.youtube.com/watch?v=PS5p9caXS4U");
            //webview.loadUrl("https://www.youtube.com/watch?v=Q_h4IoPJXZw");
            webview.loadUrl("https://www.youtube.com/watch?v=hW7DW9NIO9M");
            webview.loadUrl("https://www.youtube.com/watch?v=q65O3qA0-n4");
            webview.requestFocus();
        }
    }



