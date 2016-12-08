package com.newtechnology.www.testnewtechnology.recycleview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.newtechnology.www.testnewtechnology.R;

import java.util.List;

/**
 * Created by cuiyinglai on 2016/12/8.
 *
 */

public class MyRvOneAdapter extends RecyclerView.Adapter{
    private Context context;
    private List<String> list;

    public MyRvOneAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }

    /**
     * 创建ViewHolder
     * 这里创建item布局
     */
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(View.inflate(context,R.layout.item_rv_one_layout,null));
    }

    /**
     * 绑定ViewHolder
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //1.将holder转换为自己类型的MyViewHolder
        MyViewHolder myViewHolder= (MyViewHolder) holder;
        //2.去装配数据
        myViewHolder.setData(position);
    }

    /**
     * 获取Item的条数
     * @return
     */
    @Override
    public int getItemCount() {
        return list.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name;

        public MyViewHolder(View itemView) {
            super(itemView);
            name= (TextView) itemView.findViewById(R.id.tv_rv_one_name);
        }

        public void setData(int position) {
            name.setText(list.get(position));

            //注意千万不能糊涂这么写哈！
//            for (int i=0;i<beanList.size();i++){
//                String actor = beanList.get(i).getActor();
//                Log.e("TAG", actor);
//                name.setText(actor);
//            }
        }
    }


}
