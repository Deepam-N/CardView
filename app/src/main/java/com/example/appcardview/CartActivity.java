package com.example.appcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity {

    List<CartDataClass> list2 = new ArrayList<>();
    /*private TextView t1;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        RecyclerView cartView = findViewById(R.id.cartRecycler);
        /*t1 = findViewById(R.id.Cost);
        t1.setText(getIntent().getIntExtra("price1", 0));*/

        list2.add(new CartDataClass("Item 1", "50 INR"));
        list2.add(new CartDataClass("Item 2", "40 INR"));
        list2.add(new CartDataClass("Item 3", "60 INR"));
        Cart_RecyclerViewAdapter adapter2 = new Cart_RecyclerViewAdapter(list2);
        cartView.setAdapter(adapter2);
        cartView.setLayoutManager(new LinearLayoutManager(this));
    }
}