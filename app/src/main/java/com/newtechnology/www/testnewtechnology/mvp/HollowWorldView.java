package com.newtechnology.www.testnewtechnology.mvp;

import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * Created by cuiyinglai on 16/11/7.
 *
 * MVP-V层
 *
 * 当presenter 接到耗时业务执行完毕的通知后 会通知view执行下列方法
 */

public interface HollowWorldView extends MvpView {

    //显示红色的"hellow world"字样
    void showHellow(String greetingText);
    //显示蓝色的"Goodbye"字样
    void showGoodbye(String greetingText);


}
