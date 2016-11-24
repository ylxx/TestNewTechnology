package com.newtechnology.www.testnewtechnology.butterknife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.newtechnology.www.testnewtechnology.R;
import com.newtechnology.www.testnewtechnology.activity.MainActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ButterKnifeActivity extends AppCompatActivity {

    @BindView(R.id.show_buffer_knife)
    Button mShowBufferKnife;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butter_knife);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.show_buffer_knife)
    public void onClick() {
        Toast.makeText(ButterKnifeActivity.this, "butter knife use ok !!!", Toast.LENGTH_LONG).show();
        startActivity(new Intent(ButterKnifeActivity.this, MainActivity.class));
    }
}
