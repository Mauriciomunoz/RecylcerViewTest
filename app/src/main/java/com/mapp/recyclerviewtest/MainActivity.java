package com.mapp.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Custom adapter. The bridge between data and view.
        AdapterList adapter = new AdapterList();

        //Attach the recycclerView from XML to the code.
        rv=findViewById(R.id.myRecyclerView);
        //It helps to optimize the use of the cells when scroll
        rv.setHasFixedSize(true);

        //The layoutmanager used to set the list. It can be horizontal or vertical(defaul)
        //rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        rv.setLayoutManager(new LinearLayoutManager(this));

        //Join the adapter to the recylcerview
        rv.setAdapter(adapter);

    }
}
