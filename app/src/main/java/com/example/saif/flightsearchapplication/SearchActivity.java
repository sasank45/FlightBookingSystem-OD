package com.example.saif.flightsearchapplication;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class SearchActivity extends AppCompatActivity {
    private static final String TAG = "SearchActivity";


    DatabaseHelper mDatabaseHelpter;
    sqlHelper sqlHelper;
    private Button btnsearch;
    private EditText fromid,toid,departid,passengernoid;
    View activity_search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        }


    public void insertdata(){
            btnsearch = findViewById(R.id.searchid);
            fromid = findViewById(R.id.fromid);
            toid = findViewById(R.id.toid);
            departid = findViewById(R.id.departid);
            passengernoid = findViewById(R.id.passengernoid);
            Context context = getApplicationContext();
            CharSequence text = "Record inserted into database";
            int duration = Toast.LENGTH_SHORT;
            String newFrom = fromid.getText().toString();
            String newTo = toid.getText().toString();
            String newdepartid = departid.getText().toString();
            String newpassengernoid = passengernoid.getText().toString();
            mDatabaseHelpter.AddData(newFrom, newTo, newdepartid,newpassengernoid);
        }

        public void showListofFlights(){
            Intent intent = new Intent(this, AvailableFlights.class);
            startActivity(intent);
        }

}



