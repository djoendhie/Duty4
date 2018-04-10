package com.dot.kun.jun.duty4.RV;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.MenuItem;

import com.dot.kun.jun.duty4.R;

import java.util.ArrayList;

/**
 * Created by Jun on 4/10/2018.
 */

public class RecyclerActivity extends AppCompatActivity {
    private static RecyclerView recyclerView;

    //String and Integer array for Recycler View Items
    public static final String[] TITLES= {"Hood","Full Sleeve Shirt","Shirt","Jean Jacket","Jacket"};
    public static final Integer[] IMAGES= {
            R.drawable.ic_highlight_off_black_24dp,
            R.drawable.wa,
            R.drawable.ic_home_cyan_300_24dp,
            R.drawable.theme,
            R.drawable.dt,};


    private static String navigateFrom;//String to get Intent Value
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rec);
        initViews();
        populatRecyclerView();
    }
    // Initialize the view
    private void initViews() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//Set Back Icon on Activity

        navigateFrom = getIntent().getStringExtra("navigateFrom");//Get Intent Value in String

        recyclerView = (RecyclerView)
                findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        //Set RecyclerView type according to intent value
        if (navigateFrom.equals("horizontal")) {
            getSupportActionBar().setTitle("Horizontal Recycler View");
            recyclerView
                    .setLayoutManager(new LinearLayoutManager(
                            RecyclerActivity.this, LinearLayoutManager.HORIZONTAL, false));
        } else {
            getSupportActionBar().setTitle("Staggered GridLayout Manager");
            recyclerView
                    .setLayoutManager(new StaggeredGridLayoutManager(
                            2, StaggeredGridLayoutManager.VERTICAL));// Here 2 is no. of columns to be displayed

        }
    }


    // populate the list view by adding data to arraylist
    private void populatRecyclerView() {
        ArrayList<DataModel> arrayList = new ArrayList<>();
        for (int i = 0; i < TITLES.length; i++) {
            arrayList.add(new DataModel(TITLES[i],IMAGES[i]));
        }
        RecyclerViewAdapter  adapter = new RecyclerViewAdapter(RecyclerActivity.this, arrayList);
        recyclerView.setAdapter(adapter);// set adapter on recyclerview
        adapter.notifyDataSetChanged();// Notify the adapter

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
