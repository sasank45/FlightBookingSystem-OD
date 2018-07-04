package com.example.saif.flightsearchapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper{

    private static final String TAG = "DatabaseHelper";

    //This will make easier to change any name of Col or TAble
    private static final String TABLE_NAME = "Flight_table";
    private static final String COL1 = "ID";
    private static final String COL2 = "FROMCOL";
    private static final String COL3 = "TOCOL";
    private static final String COL4 = "DEPARTCOL";
    private static final String COL5 = "NOCOL";

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, "+ COL2 +" TEXT,"+ COL3 +" TEXT,"+ COL4 +" TEXT,"+ COL5 +" TEXT )";
        db.execSQL(createTable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP IF TABLE EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean AddData(String item2, String item3, String item4, String item5) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2, item2);
        contentValues.put(COL3, item3);
        contentValues.put(COL4, item4);
        contentValues.put(COL5, item5);
        Log.d(TAG, "addData: Adding " + item2 +item3+item5 + " to " + TABLE_NAME);

        long result = db.insert(TABLE_NAME, null, contentValues);

        //if date as inserted incorrectly it will return -1
        return result != -1;
    }


}
