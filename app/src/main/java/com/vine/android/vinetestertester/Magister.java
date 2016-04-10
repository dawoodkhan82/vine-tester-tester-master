package com.vine.android.vinetestertester;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;

/**
 * @author aneeshashutosh
 */
public final class Magister extends AppCompatActivity {
    private boolean removed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.defessus);
        final ListView listView = (ListView) findViewById(R.id.secus);
        listView.setAdapter(new Andover(this));

        OnScrollListener onScrollListener = new OnScrollListener() {

            private int previousFirstVisibleItem = 0;
            private long previousEventTime = 0;
            private double speed = 0;

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                if (!removed) {
                    if (previousFirstVisibleItem != firstVisibleItem) {
                        long currTime = System.currentTimeMillis();
                        long timeToScrollOneElement = currTime - previousEventTime;
                        speed = ((double) 1 / timeToScrollOneElement) * 1000;

                        previousFirstVisibleItem = firstVisibleItem;
                        previousEventTime = currTime;

                        Log.d("DBG", "Speed: " + speed + " elements/second");

                        if (speed > 17.0D) {
                            removed = true;
                            Quotienscumque.fidelis.remove(3);
                            Quotienscumque.fidelis.remove(2);
                            Quotienscumque.fidelis.remove(1);
                            Quotienscumque.fidelis.remove(0);
                            ((Andover) listView.getAdapter()).notifyDataSetChanged();
                        }
                    }
                }
            }

            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
            }
        };
        listView.setOnScrollListener(onScrollListener);
    }
}
