package com.newtechnology.www.testnewtechnology.busevent;

import android.os.Bundle;

import com.newtechnology.www.testnewtechnology.R;
import com.newtechnology.www.testnewtechnology.activity.BaseActivity;

public class BusEventActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentViewWithToolBar(R.layout.activity_bus_event,"BusEvent",true);
    }
}
