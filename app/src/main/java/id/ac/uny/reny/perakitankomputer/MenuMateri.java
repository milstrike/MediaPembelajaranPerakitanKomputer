package id.ac.uny.reny.perakitankomputer;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.support.design.widget.Snackbar;


public class MenuMateri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_materi);
        showSucess();
    }

    public void goToMateri_1(View V){
        SharedPreferences.Editor MateriChooser = getSharedPreferences("Materi_chooser", MODE_PRIVATE).edit();
        MateriChooser.putInt("Materi", 1);
        MateriChooser.apply();
        Intent intent = new Intent(MenuMateri.this, Materi.class);
        startActivity(intent);
    }


    public void goToMateri_2(View V){
        SharedPreferences.Editor MateriChooser = getSharedPreferences("Materi_chooser", MODE_PRIVATE).edit();
        MateriChooser.putInt("Materi", 2);
        MateriChooser.apply();
        Intent intent = new Intent(MenuMateri.this, Materi.class);
        startActivity(intent);
    }

    public void showSucess(){
        Snackbar.make(findViewById(android.R.id.content), "Pilih salah satu Materi!", Snackbar.LENGTH_INDEFINITE).show();
    }
}


