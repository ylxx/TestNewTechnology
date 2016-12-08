package com.newtechnology.www.testnewtechnology.butterknife;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.newtechnology.www.testnewtechnology.R;
import com.newtechnology.www.testnewtechnology.activity.MainActivity;
import com.newtechnology.www.testnewtechnology.activity.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ButterKnifeActivity extends BaseActivity {

    @BindView(R.id.show_buffer_knife)
    Button mShowBufferKnife;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentViewWithToolBar(R.layout.activity_butter_knife,"ButterKnifeActivity",true);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.show_buffer_knife)
    public void onClick() {
        Toast.makeText(ButterKnifeActivity.this, "butter knife use ok !!!", Toast.LENGTH_LONG).show();
        startActivity(new Intent(ButterKnifeActivity.this, MainActivity.class));
    }
}
