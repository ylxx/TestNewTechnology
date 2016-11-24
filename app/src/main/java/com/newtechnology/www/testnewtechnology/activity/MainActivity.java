package com.newtechnology.www.testnewtechnology.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.newtechnology.www.testnewtechnology.R;
import com.newtechnology.www.testnewtechnology.butterknife.ButterKnifeActivity;
import com.newtechnology.www.testnewtechnology.mvp.HelloWorldActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButtonMvp,mButtenButterKnife,mButtonBusEvent,mButtonOkHttp,mButtonRxJava;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mButtonMvp = (Button)findViewById(R.id.btn_mvp);
        mButtonMvp.setOnClickListener(this);
        mButtenButterKnife = (Button)findViewById(R.id.btn_butter_knife);
        mButtenButterKnife.setOnClickListener(this);
        mButtonBusEvent = (Button)findViewById(R.id.btn_bus_event);
        mButtonBusEvent.setOnClickListener(this);
        mButtonOkHttp = (Button)findViewById(R.id.btn_ok_http);
        mButtonOkHttp.setOnClickListener(this);
        mButtonRxJava = (Button)findViewById(R.id.btn_rx_java);
        mButtonRxJava.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_mvp:
                //跳转mvp
                startActivity(new Intent(MainActivity.this,HelloWorldActivity.class));
                break;
            case R.id.btn_butter_knife:
                //跳转butterknife
                startActivity(new Intent(MainActivity.this, ButterKnifeActivity.class));
                break;

        }

    }
}
