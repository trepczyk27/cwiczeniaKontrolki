package com.example.cwiczeniakontrolki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;

public class KoniecActivity2 extends AppCompatActivity {

    private RatingBar ocena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koniec2);

        ocena = findViewById(R.id.ocena);

        ocena.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                if(v < 4){
                    Toast.makeText(KoniecActivity2.this, "Dziękujemy za opinię", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(KoniecActivity2.this, "Dziękujemy za dobrą opinię", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}