package com.example.khaerulumam.khaerulumam_1202154148_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText namamenu,jml;
    private Button restaurant,restaurant2;
    private TextView tmptmakan;

    private int uang = 65500;

    private int jumlah1,hsl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namamenu = (EditText) findViewById(R.id.menu);
        jml = (EditText) findViewById(R.id.jumlah);
        tmptmakan = (TextView) findViewById(R.id.restaurant);

    }
    public void launcheatbus(View view) {


        String menu = namamenu.getText().toString();
        String jumlah = jml.getText().toString();
        jumlah1 = Integer.parseInt(jumlah.trim());

        hsl = jumlah1 * 50000;

        Bundle bundle = new Bundle();
        bundle.putString("Menu", menu);

        bundle.putString("Jumlah",jumlah);

        bundle.putString("Total",String.valueOf(hsl));

        bundle.putString("Restaurant","Eatbus");

        Intent a = new Intent(this,Hasil.class);

        a.putExtras(bundle);

        startActivity(a);

        if (hsl > uang){
            Toast.makeText(this,"Jangan disini makan malamnya, uang kamu tidak cukup",Toast.LENGTH_LONG).show();
        }




    }

    public void lauchabnormal(View view) {

        String menu = namamenu.getText().toString();
        String jumlah = jml.getText().toString();
        jumlah1 = Integer.parseInt(jumlah.trim());

        hsl = jumlah1 * 30000;

        Bundle bundle = new Bundle();
        bundle.putString("Menu", menu);

        bundle.putString("Jumlah",jumlah);

        bundle.putString("Total",String.valueOf(hsl));

        bundle.putString("Restaurant","Abnormal");

        Intent a = new Intent(this,Hasil.class);

        a.putExtras(bundle);

        startActivity(a);

        if (hsl < uang){
            Toast.makeText(this,"Disini aja Makan Malamnya",Toast.LENGTH_LONG).show();
        }
    }
}

