package hp.counter.com.dropin;

/**
 * Created by varun on 17-10-2015.
 */
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewCtrl extends WebViewClient {


    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}