package com.tni.terserah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void setNamaAngga(){
        varTeks1.setText("Hello Angga");
    }
    private void setNamaMadeyuukkkkk(){
        varTeks1.setText("Hello Made");
    }
    public TextView varTeks1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        varTeks1 = findViewById(R.id.id_teks1);
        varTeks1.setText("Hello Popi");
        varTeks1.setText("Hello Dwi");
        varTeks1.setText("Hello Riksa");
        setNamaAngga();
        setNamaMadeyuukkkkk();
    }



}
