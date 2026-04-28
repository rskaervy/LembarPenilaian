package com.rskaerv.lembarpenilaian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NilaiActivity extends AppCompatActivity {
    EditText edtAbsen, edtTugas, edtUTS, edtUAS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nilai_activity);

        edtAbsen  = findViewById(R.id.edtAbsen);
        edtTugas = findViewById(R.id.edtTugas);
        edtUTS = findViewById(R.id.edtUTS);
        edtUAS = findViewById(R.id.edtUAS);

        this.findViewById(R.id.btnHitungNilai).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Constants.NilaiAbsen = (Integer.parseInt(edtAbsen.getText().toString())*15)/100;
                Constants.NilaiTugas = (Integer.parseInt(edtTugas.getText().toString())*25)/100;
                Constants.NilaiUTS = (Integer.parseInt(edtUTS.getText().toString())*30)/100;
                Constants.NilaiUAS = (Integer.parseInt(edtUTS.getText().toString())*30)/100;

                Constants.NilaiMhs=Constants.NilaiAbsen+Constants.NilaiTugas+Constants.NilaiUTS+Constants.NilaiUAS;

                Intent open = new Intent(NilaiActivity.this,HasilActivity.class);
                startActivity(open);
            }
        });
    }
}