package com.example.saif.flightsearchapplication;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import com.example.saif.flightsearchapplication.dbHelper;


public class RealDatabaseHelper extends SQLiteOpenHelper {


    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "flights_db";


    public RealDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {

        // create notes table
        db.execSQL(dbHelper.CREATE_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + dbHelper.TABLE_NAME);

        // Create tables again
        onCreate(db);
    }
    public long insertNote(String id,String from, String to, String date, String passengers) {
        // get writable database as we want to write data
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        // `id` and `timestamp` will be inserted automatically.
        // no need to add them
        values.put(dbHelper.COLUMN_FROM,dbHelper.COLUMN_FROM);
        values.put(dbHelper.COLUMN_TO,to);
        values.put(dbHelper.COLUMN_DEPART,date);
        values.put(dbHelper.COLUMN_NOPass,passengers);
        // insert row
        long id = db.insert(dbHelper.TABLE_NAME, null, values);

        // close db connection
        db.close();

        // return newly inserted row id
        return id;
    }


}