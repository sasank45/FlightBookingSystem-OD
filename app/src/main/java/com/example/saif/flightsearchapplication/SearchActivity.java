package com.example.saif.flightsearchapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class SearchActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Spinner spinner1 = (Spinner) findViewById(R.id.fromid);
        spinner1.setOnItemSelectedListener(this);
        List<String> categories = new ArrayList<String>();
        categories.add("CHN");
        categories.add("BLR");
        categories.add("KOL");
        categories.add("TNL");
        categories.add("DEL");
        categories.add("AMR");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    public void listofflights(View view) {
        Intent intent = new Intent(this, AvailableFlights.class);
        Button launchActivity = (Button) findViewById(R.id.searchid);
        String message = launchActivity.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


}

