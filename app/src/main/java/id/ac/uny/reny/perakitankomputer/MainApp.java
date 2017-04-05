package id.ac.uny.reny.perakitankomputer;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);
    }

    public void goToKompetensiActivity(View V){
        Intent i = new Intent(MainApp.this, MenuKompetensi.class);
        startActivity(i);
    }

    public void goToMateriActivity(View V){
        Intent i = new Intent(MainApp.this, MenuMateri.class);
        startActivity(i);
    }

    public void goToLatihanActivity(View V){
        Intent i = new Intent(MainApp.this, Latihan.class);
        startActivity(i);
    }

    public void goToTentangActivity(View V){
        Intent i = new Intent(MainApp.this, Tentang.class);
        startActivity(i);
    }

    public void goToBantuanActivity(View V){
        Intent i = new Intent(MainApp.this, MenuBantuan.class);
        startActivity(i);
    }

    //Memanggil konfirmasi keluar
    @Override
    public void onBackPressed(){
        new AlertDialog.Builder(this)
                .setMessage("Keluar dari aplikasi ini?")
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(1);
                    }
                })
                .setNegativeButton("Tidak", null)
                .show();
    }

}
