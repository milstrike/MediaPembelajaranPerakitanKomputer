package id.ac.uny.reny.perakitankomputer;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.support.design.widget.Snackbar;


public class MenuBantuan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_bantuan);
        showSucess();
    }

    public void goToBantuan_1(View V){
        SharedPreferences.Editor BantuanChooser = getSharedPreferences("Bantuan_chooser", MODE_PRIVATE).edit();
        BantuanChooser.putInt("Bantuan", 1);
        BantuanChooser.apply();
        Intent intent = new Intent(MenuBantuan.this, Bantuan.class);
        startActivity(intent);
    }


    public void goToBantuan_2(View V){
        SharedPreferences.Editor BantuanChooser = getSharedPreferences("Bantuan_chooser", MODE_PRIVATE).edit();
        BantuanChooser.putInt("Bantuan", 2);
        BantuanChooser.apply();
        Intent intent = new Intent(MenuBantuan.this, Bantuan.class);
        startActivity(intent);
    }

    public void goToBantuan_3(View V){
        SharedPreferences.Editor BantuanChooser = getSharedPreferences("Bantuan_chooser", MODE_PRIVATE).edit();
        BantuanChooser.putInt("Bantuan", 3);
        BantuanChooser.apply();
        Intent intent = new Intent(MenuBantuan.this, Bantuan.class);
        startActivity(intent);
    }

    public void goToBantuan_4(View V){
        SharedPreferences.Editor BantuanChooser = getSharedPreferences("Bantuan_chooser", MODE_PRIVATE).edit();
        BantuanChooser.putInt("Bantuan", 4);
        BantuanChooser.apply();
        Intent intent = new Intent(MenuBantuan.this, Bantuan.class);
        startActivity(intent);
    }

    public void goToBantuan_5(View V){
        SharedPreferences.Editor BantuanChooser = getSharedPreferences("Bantuan_chooser", MODE_PRIVATE).edit();
        BantuanChooser.putInt("Bantuan", 5);
        BantuanChooser.apply();
        Intent intent = new Intent(MenuBantuan.this, Bantuan.class);
        startActivity(intent);
    }

    public void goToBantuan_6(View V){
        SharedPreferences.Editor BantuanChooser = getSharedPreferences("Bantuan_chooser", MODE_PRIVATE).edit();
        BantuanChooser.putInt("Bantuan", 6);
        BantuanChooser.apply();
        Intent intent = new Intent(MenuBantuan.this, Bantuan.class);
        startActivity(intent);
    }

    public void showSucess(){
        Snackbar.make(findViewById(android.R.id.content), "Pilih salah satu topik bantuan!", Snackbar.LENGTH_INDEFINITE).show();
    }
}


