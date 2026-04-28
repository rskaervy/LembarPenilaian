package com.rskaerv.lembarpenilaian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {
    TextView txtHasilAngka, txtHasilHuruf,txtStatus;
    int nilaiahir=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        nilaiahir = Constants.NilaiMhs;
        txtHasilAngka = findViewById(R.id.txtHasilAngka);
        txtHasilHuruf = findViewById(R.id.txtHasilHuruf);
        txtStatus = findViewById(R.id.txtStatus);
        if (nilaiahir>=85){
            txtHasilAngka.setText("4");
            txtHasilHuruf.setText("A");
            txtStatus.setText("LULUS");
        }else if (nilaiahir>=80){
            txtHasilAngka.setText("3");
            txtHasilHuruf.setText("B");
            txtStatus.setText("LULUS");
        }else if (Constants.NilaiMhs>=75){
            txtHasilAngka.setText("2");
            txtHasilHuruf.setText("C");
            txtStatus.setText("LULUS");
        }else if(Constants.NilaiMhs>=70){
            txtHasilAngka.setText("1");
            txtHasilHuruf.setText("D");
            txtStatus.setText("MENGULANG");
        }else {
            txtHasilAngka.setText("0");
            txtHasilHuruf.setText("E");
            txtStatus.setText("TIDAK LULUS");
        }

    }
}