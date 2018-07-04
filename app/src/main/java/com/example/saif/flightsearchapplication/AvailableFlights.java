package com.example.saif.flightsearchapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AvailableFlights extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_flights);
        if (savedInstanceState == null){
            getFragmentManager().beginTransaction()
                    .add(R.id.flightcontainer, ListingActivity.newInstance())
                    .commit();
        }
    }
}
