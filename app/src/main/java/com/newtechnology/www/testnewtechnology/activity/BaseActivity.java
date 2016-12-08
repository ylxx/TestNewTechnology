package com.newtechnology.www.testnewtechnology.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.newtechnology.www.testnewtechnology.R;

public class BaseActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    /**
     * @Description: 自带titlebar简单封装
     * @param
     * @return
     */
    protected void setContentViewWithToolBar(int layoutResID, String title,boolean back) {
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup contentView = (ViewGroup) inflater.inflate(
                R.layout.activity_base, null);
        inflater.inflate(layoutResID, contentView);
        setContentView(contentView);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(title);

        if(back){
            toolbar.setNavigationIcon(R.mipmap.ic_arrow_back_white);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    BaseActivity.this.finish();
                }
            });
        }


//        StatusBarUtil.setTranslucent(BaseFragmentActivity.this, StatusBarUtil.DEFAULT_STATUS_BAR_ALPHA);


//        setSupportActionBar(toolbar);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        /*getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);*/


// App Logo
//        toolbar.setLogo(R.drawable.app_refresh_goods_0);
// Title
//        toolbar.setTitle("");
// Sub Title
//        toolbar.setSubtitle("返回");

//        setSupportActionBar(toolbar);

// Navigation Icon 要設定在 setSupoortActionBar 才有作用
// 否則會出現 back button
//        toolbar.setNavigationIcon(R.drawable.app_refresh_people_0);


        /*bar = (CustomBar) findViewById(R.id.titlebar);
        bar.ininbar(contentV);
        bar.setTitleBar(title);
        bar.getLeftBar().setOnClickListener(this);*/
    }
}
