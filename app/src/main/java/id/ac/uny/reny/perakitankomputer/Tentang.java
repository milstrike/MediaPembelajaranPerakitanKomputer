package id.ac.uny.reny.perakitankomputer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class Tentang extends AppCompatActivity {

    public TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tentang);

        t = (TextView) findViewById(R.id.about);
        t.setText("167022510020\nProgram Studi Pendidikan Teknologi dan Kejuruan\nFakultas Pasca Sarjana\nUniversitas Negeri Yogyakarta");

    }
}

