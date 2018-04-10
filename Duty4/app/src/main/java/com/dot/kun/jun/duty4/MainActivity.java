package com.dot.kun.jun.duty4;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.dot.kun.jun.duty4.fragment.HomeFragment;
import com.dot.kun.jun.duty4.fragment.OthFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    android.support.v4.app.Fragment fragment = new HomeFragment();
                    android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
                    android.support.v4.app.FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.frame,fragment);
                    transaction.commit();
                     return true;
                case R.id.navigation_dashboard:
                    android.support.v4.app.Fragment fragment1 = new OthFragment();
                    android.support.v4.app.FragmentManager manager1 = getSupportFragmentManager();
                    android.support.v4.app.FragmentTransaction transaction1 = manager1.beginTransaction();
                    transaction1.replace(R.id.frame,fragment1);
                    transaction1.commit();
                     return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        Fragment fragment = new HomeFragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame,fragment);
        transaction.commit();
    }

}
