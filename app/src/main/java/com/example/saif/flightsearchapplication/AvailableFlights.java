package com.example.saif.flightsearchapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class AvailableFlights extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_flights);
    }

    public void confirmationPage(View view) {
        Intent intent = new Intent(this, ListingActivity.class);
        Button launchActivity = (Button) findViewById(R.id.searchid);
        String message = launchActivity.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
