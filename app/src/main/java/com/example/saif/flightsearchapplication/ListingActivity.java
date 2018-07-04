package com.example.saif.flightsearchapplication;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

public class ListingActivity extends Fragment {

    private static final String TAG = ListingActivity.class.getSimpleName();

    CardView mCardView;

    public static ListingActivity newInstance() {
        ListingActivity fragment = new ListingActivity();
        fragment.setRetainInstance(true);
        return fragment;
    }

    public ListingActivity() {
        // Required
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup flightcontainer,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.activity_listing, flightcontainer, false);
    }
    }

