package com.dot.kun.jun.duty4.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dot.kun.jun.duty4.R;
import com.dot.kun.jun.duty4.RV.RecyclerActivity;
import com.dot.kun.jun.duty4.homepindah.CircleActivity;
import com.dot.kun.jun.duty4.homepindah.ClickActivity;
import com.dot.kun.jun.duty4.homepindah.ColapsActivity;
import com.dot.kun.jun.duty4.homepindah.GridActivity;
import com.dot.kun.jun.duty4.homepindah.StagActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


public class HomeFragment extends Fragment {
    @BindView(R.id.imggrid)
    ImageView imggrid;
    @BindView(R.id.txtgrid)
    TextView txtgrid;
    @BindView(R.id.imgtool)
    ImageView imgtool;
    @BindView(R.id.txttool)
    TextView txttool;
    @BindView(R.id.imggridclick)
    ImageView imggridclick;
    @BindView(R.id.txtgridclick)
    TextView txtgridclick;
    @BindView(R.id.imgmenu)
    ImageView imgmenu;
    @BindView(R.id.txtmenu)
    TextView txtmenu;
    @BindView(R.id.imgstag)
    ImageView imgstag;
    @BindView(R.id.txtstag)
    TextView txtstag;
    Unbinder unbinder;
    @BindView(R.id.imgstaghor)
    ImageView imgstaghor;
    @BindView(R.id.txtstaghor)
    TextView txtstaghor;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.imggrid)
    public void onImggridClicked() {
        startActivity(new Intent(getActivity(), GridActivity.class));
    }

    @OnClick(R.id.txtgrid)
    public void onTxtgridClicked() {
        startActivity(new Intent(getActivity(), GridActivity.class));
    }

    @OnClick(R.id.imgtool)
    public void onImgtoolClicked() {
        startActivity(new Intent(getActivity(), ColapsActivity.class));
    }

    @OnClick(R.id.txttool)
    public void onTxttoolClicked() {
        startActivity(new Intent(getActivity(), ColapsActivity.class));
    }

    @OnClick(R.id.imggridclick)
    public void onImggridclickClicked() {
        startActivity(new Intent(getActivity(), ClickActivity.class));
    }

    @OnClick(R.id.txtgridclick)
    public void onTxtgridclickClicked() {
        startActivity(new Intent(getActivity(), ClickActivity.class));
    }

    @OnClick(R.id.imgmenu)
    public void onImgmenuClicked() {
        startActivity(new Intent(getActivity(), CircleActivity.class));
    }

    @OnClick(R.id.txtmenu)
    public void onTxtmenuClicked() {
        startActivity(new Intent(getActivity(), CircleActivity.class));
    }

    @OnClick(R.id.imgstag)
    public void onImgstagClicked() {
        startActivity(new Intent(getActivity(), StagActivity.class));
    }

    @OnClick(R.id.txtstag)
    public void onTxtstagClicked() {
        startActivity(new Intent(getActivity(), StagActivity.class));
    }

    @OnClick({R.id.imgstaghor, R.id.txtstaghor})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.imgstaghor:
                startActivity(new Intent(getActivity(), RecyclerActivity.class));
                break;
            case R.id.txtstaghor:
                startActivity(new Intent(getActivity(), RecyclerActivity.class));
                break;
        }
    }
}
