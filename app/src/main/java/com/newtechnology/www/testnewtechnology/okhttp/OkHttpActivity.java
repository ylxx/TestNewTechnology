package com.newtechnology.www.testnewtechnology.okhttp;

import android.os.Bundle;

import com.newtechnology.www.testnewtechnology.R;
import com.newtechnology.www.testnewtechnology.activity.BaseActivity;

public class OkHttpActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentViewWithToolBar(R.layout.activity_ok_http,"OkHttp",true);
    }
}
