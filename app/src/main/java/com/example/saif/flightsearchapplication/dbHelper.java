package com.example.saif.flightsearchapplication;

public class dbHelper {

    public static final String TABLE_NAME = "flighttable";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_FROM = "from";
    public static final String COLUMN_TO = "to";
    public static final String COLUMN_DEPART ="date";
    public static final String COLUMN_NOPass = "passengers";

    private int id;
    private String from;
    private String to;
    private String date;
    private String passengers;


    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_FROM  + " TEXT,"
                    + COLUMN_TO  + " TEXT,"
                    + COLUMN_DEPART  + " TEXT,"
                    + COLUMN_NOPass  + " TEXT,"
                    + ")";

    public dbHelper() {
    }

    public dbHelper(int id, String from, String to,String date,String passengers) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.date = date;
        this.passengers=passengers;
    }

    public int getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public void setfrom(String from) {
        this.from = from;
    }

    public String to() {
        return to;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void to(String to) {
        this.to = to;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String from) {
        this.date = date;
    }
    public String setPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }
}