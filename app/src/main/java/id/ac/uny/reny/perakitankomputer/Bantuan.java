package id.ac.uny.reny.perakitankomputer;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Bantuan extends AppCompatActivity {

    private ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bantuan);

        String URIBantuan = "";

        SharedPreferences bantuanChooser = getSharedPreferences("Bantuan_chooser", 0);
        int bantuan = bantuanChooser.getInt("Bantuan", 0);

        switch(bantuan){
            case 1:
                URIBantuan = "file:///android_asset/file_html/help1.html";
                break;
            case 2:
                URIBantuan = "file:///android_asset/file_html/help2.html";
                break;
            case 3:
                URIBantuan = "file:///android_asset/file_html/help3.html";
                break;
            case 4:
                URIBantuan = "file:///android_asset/file_html/help4.html";
                break;
            case 5:
                URIBantuan = "file:///android_asset/file_html/help5.html";
                break;
            case 6:
                URIBantuan = "file:///android_asset/file_html/help6.html";
                break;
        }

        progress = new ProgressDialog(this);
        progress.setMessage("Memuat bantuan...");
        progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progress.setIndeterminate(true);

        WebChromeClient webChromeClient = new WebChromeClient();
        WebView penampilBantuan = (WebView) findViewById(R.id.bantuan_viewer);
        penampilBantuan.getSettings().setJavaScriptEnabled(true);
        penampilBantuan.setWebChromeClient(webChromeClient);
        penampilBantuan.setWebViewClient(new loaderProgress());
        penampilBantuan.loadUrl(URIBantuan);
        progress.show();
    }

    private class loaderProgress extends WebViewClient {
        public void onPageFinished (WebView view, String url) {
            progress.dismiss();
        }
    }

}

