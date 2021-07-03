package com.example.appcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<DataClass> list = new ArrayList<>();
    /*private int toasttext = 0;
    private EditText et1,et2,et3;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        /*int p1=50,p2=40,p3=60;
        et1=findViewById(R.id.Quantity);
        */
        list.add(new DataClass("Item 1", "50 INR", R.drawable.orange));
        list.add(new DataClass("Item 2", "40 INR", R.drawable.apple));
        list.add(new DataClass("Item 3", "60 INR", R.drawable.banana));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    public void SwitchActivity(View view){
        Intent SwitchActivity = new Intent(this, CartActivity.class);
        /*SwitchActivity.putExtra("price1",toasttext);*/
        startActivity(SwitchActivity);

    }
}