package id.ac.uny.reny.perakitankomputer;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Materi extends AppCompatActivity {

    private WebView penampilMateri;
    private WebChromeClient webChromeClient;
    private ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.materi);

        String URIKompetensi = "";

        SharedPreferences materiChooser = getSharedPreferences("Materi_chooser", 0);
        int materi = materiChooser.getInt("Materi", 0);

        switch(materi){
            case 1:
                URIKompetensi = "file:///android_asset/file_html/materi1.html";
                break;
            case 2:
                URIKompetensi = "file:///android_asset/file_html/materi2.html";
                break;
        }

        progress = new ProgressDialog(this);
        progress.setMessage("Memuat Materi...");
        progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progress.setIndeterminate(true);

        webChromeClient = new WebChromeClient();
        penampilMateri = (WebView) findViewById(R.id.materi_viewer);
        penampilMateri.getSettings().setJavaScriptEnabled(true);
        penampilMateri.setWebChromeClient(webChromeClient);
        penampilMateri.setWebViewClient(new loaderProgress());
        penampilMateri.loadUrl(URIKompetensi);
        progress.show();
    }

    private class loaderProgress extends WebViewClient {
        public void onPageFinished (WebView view, String url) {
            progress.dismiss();
        }
    }

}

