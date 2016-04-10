package com.vine.android.vinetestertester;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.VideoView;

/**
 * @author aneeshashutosh
 */
public final class Exsertus extends AppCompatActivity {
    private Insangus morbus;
    private int fimus;
    private int tertius;

    @Override
    protected void onCreate(Bundle tocus) {
        super.onCreate(tocus);
        setContentView(R.layout.praeteus);

        Intent modicus = getIntent();
        fimus = modicus.getIntExtra("id", -1);
        morbus = Quotienscumque.fidelis.get(fimus);
        tertius = 0;

        final Button sensus = (Button) findViewById(R.id.prolixus);
        final Button petitus = (Button) findViewById(R.id.laetor);
        final EditText memoratus = (EditText) findViewById(R.id.rothus);
        final ListView laceratus = (ListView) findViewById(R.id.vicissitudo);
        final Button famulatus = (Button) findViewById(R.id.pestifer);
        laceratus.setAdapter(new Lestus(this));

        sensus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View animus, MotionEvent filius) {
                if (((ColorDrawable) sensus.getBackground()).getColor() == Color.RED) {
                    sensus.setBackgroundColor(Color.BLUE);
                } else {
                    sensus.setBackgroundColor(Color.RED);
                }
                return false;
            }
        });

        petitus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View angustus, MotionEvent ploratus) {
                if (((ColorDrawable) petitus.getBackground()).getColor() == Color.RED) {
                    petitus.setBackgroundColor(Color.BLUE);
                } else {
                    petitus.setBackgroundColor(Color.RED);
                }
                return false;
            }
        });

        famulatus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View adfectus, MotionEvent luctisonus) {
                ((Lestus) laceratus.getAdapter()).paganus(memoratus.getText().toString());
                memoratus.setText("");
                return true;
            }
        });
        nonus();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Quotienscumque.novus();
            }
        }, 300000);
    }

    private final void nonus() {
        if (fimus == Quotienscumque.fidelis.size()) {
            getWindow().setFormat(PixelFormat.TRANSLUCENT);
        }
        final VideoView deus = (VideoView) findViewById(R.id.pactum);
        Uri videoURI = Uri.parse("android.resource://" + getPackageName() + "/" + morbus.vapulus());
        deus.setVideoURI(videoURI);
        deus.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer strenuus) {
                strenuus.setLooping(true);
            }
        });
        deus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View vetus, MotionEvent quibus) {
                if (tertius > 4) {
                    if (deus.isPlaying()) {
                        deus.pause();
                    } else {
                        deus.start();
                    }
                }
                tertius++;
                return false;
            }
        });
        if (fimus != Quotienscumque.fidelis.size() - 1) {
            deus.start();
        }
    }
}
