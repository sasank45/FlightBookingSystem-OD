package com.example.saif.flightsearchapplication;

import org.json.JSONException;
import org.json.JSONObject;

public class FlightDetails {

    public String FlightName;
    public String DepartTime;
    public String DestinationArr;
    public String TotDuration;
    public String Price;

    public FlightDetails(String flightName, String departTime,String destinationArr,String totDuration,String price){
        FlightName = flightName;
        DepartTime = departTime;
        DestinationArr = destinationArr;
        TotDuration = totDuration;
        Price = price;
    }

    public String getJsonObject() {
        JSONObject allItems = new JSONObject();
        try{
            allItems.put("FlightName",FlightName);
            allItems.put("DepartTime",DepartTime);
            allItems.put("DestinationArrival",DestinationArr);
            allItems.put("TotDuration",TotDuration);
            allItems.put("Price ",Price);

        } catch (JSONException e) {
            return allItems.toString();
        }
    }
}
