package com.newtechnology.www.testnewtechnology.mvp.mosby;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hannesdorfmann.mosby.mvp.MvpActivity;
import com.newtechnology.www.testnewtechnology.R;

public class HelloWorldActivity extends MvpActivity<HollowWorldView,HellowWorldPresenter>
        implements HollowWorldView , View.OnClickListener{

    private TextView greetingTextView;
    private Button btHellow,btGoodbye;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        
        initView();
    }

    private void initView() {
        greetingTextView = (TextView) findViewById(R.id.tv_show);
        btHellow = (Button) findViewById(R.id.btn_hellow);
        btGoodbye = (Button) findViewById(R.id.btn_goodbye);
        btHellow.setOnClickListener(this);
        btGoodbye.setOnClickListener(this);

    }

    @NonNull
    @Override
    public HellowWorldPresenter createPresenter() {
        return new HellowWorldPresenter();
    }

    @Override
    public void showHellow(String greetingText) {
        greetingTextView.setTextColor(Color.RED);
        greetingTextView.setText(greetingText);
    }

    @Override
    public void showGoodbye(String greetingText) {
        greetingTextView.setTextColor(Color.BLUE);
        greetingTextView.setText(greetingText);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_hellow:
                presenter.showHollo();
                break;
            case R.id.btn_goodbye:
                presenter.showGoodbye();
                break;
        }
    }
}
