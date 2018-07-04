package com.example.saif.flightsearchapplication;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.media.Image;
import android.util.Log;

public class sqlHelper extends SQLiteOpenHelper {

    private static final String dbNM = "flights.db";
    private static final String tblName = "flighttable";

    public sqlHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void createtb(){
        SQLiteDatabase database = getWritableDatabase();
        String query="create table if not exists "+tblName +"(id integer primary key AUTOINCREMENT,name text,dprttime text,arvltime text,totldur text,Price text)";
        database.execSQL(query);
        Log.d("Table Create",query);

    }
    public void droptb(){
        SQLiteDatabase database = getWritableDatabase();
        String query="drop table "+tblName;
        database.execSQL(query);
        Log.d("Table Drop",query);

    }

    public void insert(String name, String dprttime, String arvltime, String totldur, String Price){
        SQLiteDatabase database = getWritableDatabase();
        String query ="insert into table "+tblName + " (name,dprttime,arvltime,totldur,Price) values ('"+name+"','"+dprttime+"','"+arvltime+"','"+totldur+"','"+Price+"')";
        database.execSQL(query);
        Log.d(" tbl insert",query);
    }

    public Cursor getRow(String id){
        SQLiteDatabase database=getReadableDatabase();
        Cursor cursor=database.rawQuery("select name,dprttime,arvltime,totldur,Price from "+tblName+" where id ='"+id+"'",null);
    }

}
