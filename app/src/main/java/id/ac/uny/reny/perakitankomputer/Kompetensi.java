package id.ac.uny.reny.perakitankomputer;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Kompetensi extends AppCompatActivity {

    private WebView penampilKompetensi;
    private WebChromeClient webChromeClient;
    private ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kompetensi);

        String URIKompetensi = "";

        SharedPreferences kompetensiChooser = getSharedPreferences("kompetensi_chooser", 0);
        int kompetensi = kompetensiChooser.getInt("kompetensi", 0);

        switch(kompetensi){
            case 1:
                URIKompetensi = "file:///android_asset/file_html/kompetensi_1.html";
                break;
            case 2:
                URIKompetensi = "file:///android_asset/file_html/kompetensi_2.html";
                break;
        }

        progress = new ProgressDialog(this);
        progress.setMessage("Memuat Kompetensi...");
        progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progress.setIndeterminate(true);

        webChromeClient = new WebChromeClient();
        penampilKompetensi = (WebView) findViewById(R.id.kompetensi_viewer);
        penampilKompetensi.getSettings().setJavaScriptEnabled(true);
        penampilKompetensi.setWebChromeClient(webChromeClient);
        penampilKompetensi.setWebViewClient(new loaderProgress());
        penampilKompetensi.loadUrl(URIKompetensi);
        progress.show();
    }

    private class loaderProgress extends WebViewClient {
        public void onPageFinished (WebView view, String url) {
            progress.dismiss();
        }
    }

}

