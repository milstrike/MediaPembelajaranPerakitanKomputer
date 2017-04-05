package id.ac.uny.reny.perakitankomputer;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.support.design.widget.Snackbar;


public class MenuKompetensi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_kompetensi);
        showSucess();
    }

    public void goToKompetensi_1(View V){
        SharedPreferences.Editor kompetensiChooser = getSharedPreferences("kompetensi_chooser", MODE_PRIVATE).edit();
        kompetensiChooser.putInt("kompetensi", 1);
        kompetensiChooser.apply();
        Intent intent = new Intent(MenuKompetensi.this, Kompetensi.class);
        startActivity(intent);
    }


    public void goToKompetensi_2(View V){
        SharedPreferences.Editor kompetensiChooser = getSharedPreferences("kompetensi_chooser", MODE_PRIVATE).edit();
        kompetensiChooser.putInt("kompetensi", 2);
        kompetensiChooser.apply();
        Intent intent = new Intent(MenuKompetensi.this, Kompetensi.class);
        startActivity(intent);
    }

    public void showSucess(){
        Snackbar.make(findViewById(android.R.id.content), "Pilih salah satu kompetensi!", Snackbar.LENGTH_INDEFINITE).show();
    }
}


