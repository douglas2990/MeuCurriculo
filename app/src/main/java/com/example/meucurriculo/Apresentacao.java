package com.example.meucurriculo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Apresentacao extends AppCompatActivity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apresentacao);

        Handler handler = new Handler();
        handler.postDelayed((Runnable)this,4000);
    }

    @Override
    public void run() {
        Intent intent = new Intent(Apresentacao.this, MainActivity.class);
        startActivity(intent);
    }
}