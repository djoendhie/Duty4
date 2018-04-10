package com.dot.kun.jun.duty4.RV;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dot.kun.jun.duty4.R;

/**
 * Created by Jun on 4/10/2018.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    public TextView title;
    public ImageView imageview;




    public RecyclerViewHolder(View view) {
        super(view);
        // Find all views ids

        this.title = (TextView) view
                .findViewById(R.id.title);
        this.imageview = (ImageView) view
                .findViewById(R.id.image);


    }
}
