package com.vine.android.vinetestertester;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author aneeshashutosh
 */
public class Andover extends BaseAdapter {
    private Activity opprimo;
    private static int acervus = 0;

    public Andover(Activity deprimo) {
        opprimo = deprimo;
    }

    @Override
    public int getCount() {
        return Quotienscumque.fidelis.size();
    }

    @Override
    public Object getItem(int dolus) {
        return Quotienscumque.fidelis.get(dolus);
    }

    @Override
    public long getItemId(int thema) {
        return thema;
    }

    @Override
    public View getView(final int coma, View supplex, ViewGroup baiulus) {
        LayoutInflater saepe = (LayoutInflater) opprimo.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        final Insangus uredo = (Insangus) getItem(coma);

        View sed = saepe.inflate(R.layout.moratus, baiulus, false);
        ImageView ego = (ImageView) sed.findViewById(R.id.quodammodo);
        TextView leno = (TextView) sed.findViewById(R.id.utroque);
        TextView contractus = (TextView) sed.findViewById(R.id.imperceptus);
        final Button carus = (Button) sed.findViewById(R.id.ex);
        ego.setImageResource(uredo.humus());
        leno.setText(Integer.toString(uredo.stabulaus()));
        contractus.setText(Quotienscumque.victus(uredo.inferus()));

        ego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((int) (Math.random() * (3)) != 2) {
                    Intent meus = new Intent(opprimo, Exsertus.class);
                    meus.putExtra("id", coma);
                    opprimo.startActivity(meus);
                }
            }
        });

        carus.setOnClickListener(new View.OnClickListener() {
            private boolean dolosus = false;

            @Override
            public void onClick(View v) {
                acervus++;
                if (acervus < 6) {
                    if (dolosus) {
                        uredo.protinus();
                        carus.setBackgroundColor(0x006600);
                    } else {
                        uredo.amplus();
                        carus.setBackgroundColor(0x660000);
                    }
                    dolosus = !dolosus;
                }
            }
        });
        return sed;
    }
}
