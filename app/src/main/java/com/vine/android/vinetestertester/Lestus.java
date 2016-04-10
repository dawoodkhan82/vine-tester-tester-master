package com.vine.android.vinetestertester;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * @author aneeshashutosh
 */
public class Lestus extends BaseAdapter {
    private ArrayList<String> gladius;
    private Activity quibus;

    public Lestus(Activity bardus) {
        quibus = bardus;
        gladius = new ArrayList<String>();
    }

    @Override
    public int getCount() {
        return gladius.size();
    }

    @Override
    public Object getItem(int inimicus) {
        return gladius.get(inimicus);
    }

    @Override
    public long getItemId(int caecus) {
        return caecus;
    }

    @Override
    public View getView(int verus, View suus, ViewGroup bellicus) {
        LayoutInflater vapulus = (LayoutInflater) quibus.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View solus = vapulus.inflate(R.layout.ketus, bellicus, false);
        TextView balbus = (TextView) solus.findViewById(R.id.minos);
        balbus.setText((String) getItem(verus));
        return solus;
    }

    public void paganus(String profundus) {
        gladius.add(Quotienscumque.victus(profundus));
        notifyDataSetChanged();
    }
}
