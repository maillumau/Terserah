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
        //varTeks1.setText("Hello Popi");
        varTeks1.setText("Hello Dwi");
        //varTeks1.setText("Hello Riksa");
        //setNamaAngga();
        setNamaMadeyuukkkkk();
       // setNamaBerdua();
        String namaMaul = "Hello Maul";
        setNamaMaul(namaMaul);
        String namaMulyadi = "Hello Mulyadi";
        setNamaMaul(namaMulyadi);

        String namaFilham = Terserah.TAG_FILHAM;
        setNamaMaul(namaFilham);

        Terserah rh = new Terserah();
        String namaRifqi = rh.TAG_NAMA_RIFQI;
        setNamaMaul(namaRifqi);
    }
    public void setNamaBerdua(){
        varTeks1.setText("Hello Eko");
        varTeks1.setText("Hello Libri");
    }
    void setNamaMaul(String nama){
        varTeks1.setText(nama);

    }




}
