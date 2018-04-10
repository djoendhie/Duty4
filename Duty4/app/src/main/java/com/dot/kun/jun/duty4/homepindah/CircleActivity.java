package com.dot.kun.jun.duty4.homepindah;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.dot.kun.jun.duty4.R;
import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class CircleActivity extends AppCompatActivity {

    String isi [] = {"Facebook", "Google+", "YouTube", "Whatsapp", "Gmail"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        CircleMenu circleMenu = (CircleMenu)findViewById(R.id.circle_menu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD")
                ,R.drawable.ic_zoom_in_cyan_300_24dp
                ,R.drawable.ic_highlight_off_cyan_300_24dp)

                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.fb)
                .addSubMenu(Color.parseColor("#C63737"),R.drawable.gmail)
                .addSubMenu(Color.parseColor("#D41D1D"),R.drawable.plus)
                .addSubMenu(Color.parseColor("#0F8D08"),R.drawable.wa)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.yt)

                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int i) {
                        Toast.makeText(CircleActivity.this
                                ,"Ter-Click" + " " +isi[i]
                                , Toast.LENGTH_SHORT).show();
                    }
                });
    }
}

















