package com.newtechnology.www.testnewtechnology.rxjava;

import android.os.Bundle;

import com.newtechnology.www.testnewtechnology.R;
import com.newtechnology.www.testnewtechnology.activity.BaseActivity;

public class RxJavaActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentViewWithToolBar(R.layout.activity_rx_java,"RxJava",true);
    }
}
