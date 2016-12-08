package com.newtechnology.www.testnewtechnology.mvp.original;

import android.os.Bundle;

import com.newtechnology.www.testnewtechnology.R;
import com.newtechnology.www.testnewtechnology.activity.BaseActivity;

public class OriginalMvpActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentViewWithToolBar(R.layout.activity_original_mvp,"Mvp基本方式",true);
    }
}
