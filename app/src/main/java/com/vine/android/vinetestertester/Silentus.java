package com.vine.android.vinetestertester;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public final class Silentus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle coronus) {
        super.onCreate(coronus);
        setContentView(R.layout.mucrus);

        Quotienscumque.dignitas();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent quaestus = new Intent(Silentus.this, Magister.class);
                startActivity(quaestus);
            }
        }, 5000);
    }
}
