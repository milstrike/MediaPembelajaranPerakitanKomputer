package id.ac.uny.reny.perakitankomputer;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Latihan extends AppCompatActivity {

    private WebView penampilKompetensi;
    private WebChromeClient webChromeClient;
    private ProgressDialog progress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latihan);

        String URIKompetensi = "file:///android_asset/file_html/kuis.html";

        progress = new ProgressDialog(this);
        progress.setMessage("Memuat Latihan");
        progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progress.setIndeterminate(true);


        webChromeClient = new WebChromeClient();
        penampilKompetensi = (WebView) findViewById(R.id.latihan_viewer);
        penampilKompetensi.getSettings().setJavaScriptEnabled(true);
        penampilKompetensi.setWebChromeClient(new JsAlertWebViewChrome());
        penampilKompetensi.setWebViewClient(new loaderProgress());
        penampilKompetensi.loadUrl(URIKompetensi);
        progress.show();
    }

    //Memanggil konfirmasi keluar
    @Override
    public void onBackPressed(){
        new AlertDialog.Builder(this)
                .setMessage("Akhiri Latihan?")
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("Tidak", null)
                .show();
    }

    private class JsAlertWebViewChrome extends WebChromeClient {
        @Override
        public boolean onJsAlert(WebView view, String url, String message, final JsResult result) {
            AlertDialog.Builder b = new AlertDialog.Builder(view.getContext())
                    .setTitle("Latihan Perakitan Komputer:")
                    .setMessage(message)
                    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            result.confirm();
                        }
                    });
            b.show();
            return true;
        }
    }

    private class loaderProgress extends WebViewClient {
        public void onPageFinished (WebView view, String url) {
            progress.dismiss();
        }
    }
}

