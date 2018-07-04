package com.example.saif.flightsearchapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class SearchActivity extends AppCompatActivity {
    private static final String TAG = "SearchActivity";

    DatabaseHelper mDatabaseHelpter;
    sqlHelper sqlHelper;
    Button btsearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        btsearch = (Button) findViewById(R.id.searchid);

    }

    public void showListofFlights(View view){
        Intent intent = new Intent(SearchActivity.this,AvailableFlights.class);
        startActivity(intent);
    }



}

