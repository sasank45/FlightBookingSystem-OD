package com.example.saif.flightsearchapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AvailableFlights extends AppCompatActivity {

    private ListView listView;
    private ListAdapter listAdapter;
    ArrayList<FlightDetails> products = new ArrayList<>();
    Button btnPlaceOrder;
    ArrayList<FlightDetails> productOrders = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_flights);
        getProduct();
        listView = (ListView) findViewById(R.id.customListView);
        listAdapter = new ListAdapter(this,products);
        listView.setAdapter(listAdapter);
        btnPlaceOrder = (Button) findViewById(R.id.btnPlaceOrder);
        btnPlaceOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeOrder();
            }
        });
    }

    private void placeOrder()
    {
        productOrders.clear();
        for(int i=0;i<listAdapter.listProducts.size();i++)
        {
            if(listAdapter.listProducts.get(i).CartQuantity > 0)
            {
                FlightDetails products = new FlightDetails(
                        listAdapter.listProducts.get(i).ProductName
                        ,listAdapter.listProducts.get(i).ProductPrice
                        ,listAdapter.listProducts.get(i).ProductImage
                );
                products.CartQuantity = listAdapter.listProducts.get(i).CartQuantity;
                productOrders.add(products);
            }
        }
    }

    public void getProduct() {
        products.add(new FlightDetails("Video Recorder",10.0d,R.mipmap.camera));
    }
}
