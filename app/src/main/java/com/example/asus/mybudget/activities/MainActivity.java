package com.example.asus.mybudget.activities;

import android.content.res.Resources;
import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.widget.TabHost;

import com.example.asus.mybudget.R;


public class MainActivity extends TabActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources resources=getResources();
        TabHost tabHost = getTabHost();

        TabHost.TabSpec thuchi = tabHost.newTabSpec("Thu Chi");
        thuchi.setIndicator("Thu Chi", getResources().getDrawable(R.drawable.thuchi2));
        Intent i = new Intent(this, ThuChiMainActivity.class);
        thuchi.setContent(i);

        TabHost.TabSpec thongke = tabHost.newTabSpec("Thống Kê");

        thongke.setIndicator("Thống Kê", getResources().getDrawable(R.drawable.thongke));
        Intent o = new Intent(this, StatsActivity.class);
        thongke.setContent(o);

        TabHost.TabSpec caidat = tabHost.newTabSpec("Thêm nhóm");
        caidat.setIndicator("Thêm nhóm", getResources().getDrawable(R.drawable.caidat2));
        Intent p = new Intent(this, CaiDatActivity.class);
        caidat.setContent(p);

        tabHost.addTab(thuchi);
        tabHost.addTab(thongke);
        tabHost.addTab(caidat);

        tabHost.setCurrentTab(0);

    }

}


