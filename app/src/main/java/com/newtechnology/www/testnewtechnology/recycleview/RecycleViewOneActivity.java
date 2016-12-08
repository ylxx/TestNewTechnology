package com.newtechnology.www.testnewtechnology.recycleview;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.newtechnology.www.testnewtechnology.R;
import com.newtechnology.www.testnewtechnology.activity.BaseActivity;
import com.newtechnology.www.testnewtechnology.recycleview.adapter.MyRvOneAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuiyinglai on 2016/12/8.
 *  最基本的 recycleview 使用方法
 */
public class RecycleViewOneActivity extends BaseActivity {

    private RecyclerView mRecycleView;
    private List<String> beanList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentViewWithToolBar(R.layout.activity_recycle_view_one,"RecycleView最基本用法",true);
        initView();
        initData();

        MyRvOneAdapter adapter = new MyRvOneAdapter(this, beanList);
        mRecycleView.setAdapter(adapter);
        /** recycleView不仅要设置适配器还要设置布局管理者,否则图片不显示 */
        GridLayoutManager manager = new GridLayoutManager(this, 1);
        mRecycleView.setLayoutManager(manager);
    }

    private void initView() {
        mRecycleView = (RecyclerView) findViewById(R.id.rv_activity1);
    }

    private void initData() {
        beanList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String bean = new String("暗鸦" + i + "号");
            beanList.add(bean);
        }
    }
}
