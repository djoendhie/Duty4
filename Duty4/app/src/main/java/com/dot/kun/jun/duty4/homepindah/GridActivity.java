package com.dot.kun.jun.duty4.homepindah;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

import com.dot.kun.jun.duty4.R;

public class GridActivity extends AppCompatActivity {

    GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

//        gridLayout =(GridLayout)findViewById(R.id.gridtoogle);


//        tooglded(gridLayout);
//    }
//
//    private void tooglded(GridLayout gridLayout) {
//        for (int i = 0;1<gridLayout.getChildCount();i++){
//
//            final CardView cardView = (CardView) gridLayout.getChildAt(i);
//            cardView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1){
//                        cardView.setCardBackgroundColor(Color.parseColor("#00cbcc"));
//                    }else{
//                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
//                    }
//
//                }
//            });
//        }

    }
}
