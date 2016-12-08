package com.newtechnology.www.testnewtechnology.mvp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.newtechnology.www.testnewtechnology.R;
import com.newtechnology.www.testnewtechnology.activity.BaseActivity;
import com.newtechnology.www.testnewtechnology.mvp.mosby.HelloWorldActivity;
import com.newtechnology.www.testnewtechnology.mvp.original.OriginalMvpActivity;

public class MyMvpActivity extends BaseActivity implements View.OnClickListener{

    private Button mButtonMosbt,mButtonOriginal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentViewWithToolBar(R.layout.activity_mvp,"Mvp",true);

        initview();
    }

    private void initview() {

        mButtonMosbt = (Button) findViewById(R.id.btn_mosby_activity);
        mButtonMosbt.setOnClickListener(this);
        mButtonOriginal = (Button) findViewById(R.id.btn_original_activity);
        mButtonOriginal.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_mosby_activity:
                startActivity(new Intent(MyMvpActivity.this, HelloWorldActivity.class));
                break;
            case R.id.btn_original_activity:
                startActivity(new Intent(MyMvpActivity.this, OriginalMvpActivity.class));
                break;
            default:
                break;
        }

    }
}
