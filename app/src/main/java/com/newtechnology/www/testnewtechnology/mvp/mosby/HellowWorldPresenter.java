package com.newtechnology.www.testnewtechnology.mvp.mosby;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;

/**
 * Created by cuiyinglai on 16/11/7.
 *
 * MVP-P层
 */

public class HellowWorldPresenter extends MvpBasePresenter<HollowWorldView>{


    //Greeting Tesk 是业务逻辑
    private GreetingGeneratorTask mGreetingGeneratorTask;

    private void cancleGreetingTaskIfRunning(){
        if(mGreetingGeneratorTask != null){
            mGreetingGeneratorTask.cancel(true);
        }
    }

    public void showHollo(){
        cancleGreetingTaskIfRunning();
        mGreetingGeneratorTask = new GreetingGeneratorTask("Hello", new GreetingGeneratorTask.GreetingTeskListener() {
            @Override
            public void onCreetingCenerated(String greetingText) {
                if(isViewAttached())
                    getView().showHellow(greetingText);
            }
        });
        mGreetingGeneratorTask.execute();
    }

    public void showGoodbye(){
        cancleGreetingTaskIfRunning();
        mGreetingGeneratorTask = new GreetingGeneratorTask("Goodbye", new GreetingGeneratorTask.GreetingTeskListener() {
            @Override
            public void onCreetingCenerated(String greetingText) {
                if(isViewAttached()){
                    getView().showGoodbye(greetingText);
                }
            }
        });
        mGreetingGeneratorTask.execute();
    }


    //当activity销毁时，取消正在运行中的异步任务
    public void detachView(boolean retainPresenterInstance){
        super.detachView(retainPresenterInstance);
        if(!retainPresenterInstance){
            cancleGreetingTaskIfRunning();
        }

    }

}
