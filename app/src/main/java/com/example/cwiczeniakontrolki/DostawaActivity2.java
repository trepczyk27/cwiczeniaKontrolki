package com.example.cwiczeniakontrolki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DostawaActivity2 extends AppCompatActivity {

    private Button cofnij, dalej;
    private EditText adres, telefon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dostawa2);

        cofnij = findViewById(R.id.cofnij);
        dalej = findViewById(R.id.dalej);

        adres = findViewById(R.id.edtAdres);
        telefon = findViewById(R.id.edtTele);


cofnij.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent back = new Intent(DostawaActivity2.this, MainActivity.class);
        startActivity(back);
    }
});
dalej.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent next = new Intent(DostawaActivity2.this, KawaActivity2.class);
        next.putExtra("Adres", adres.getText().toString());
        next.putExtra("Telefon", telefon.getText().toString());
        startActivity(next);
    }
});

    }
}