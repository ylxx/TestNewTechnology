package com.newtechnology.www.testnewtechnology.recycleview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.newtechnology.www.testnewtechnology.R;
import com.newtechnology.www.testnewtechnology.activity.BaseActivity;

public class RecycleViewActivity extends BaseActivity implements View.OnClickListener{

    private Button btToOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentViewWithToolBar(R.layout.activity_recycle_view,"RecycleView",true);
        initview();
    }

    private void initview() {
        btToOne = (Button)findViewById(R.id.btn_recycle_bt1);
        btToOne.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_recycle_bt1:
                startActivity(new Intent(RecycleViewActivity.this,RecycleViewOneActivity.class));
                break;
            default:
                break;

        }
    }
}
