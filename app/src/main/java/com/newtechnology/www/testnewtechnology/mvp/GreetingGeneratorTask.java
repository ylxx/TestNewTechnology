package com.newtechnology.www.testnewtechnology.mvp;

import android.os.AsyncTask;

/**
 * Created by cuiyinglai on 16/11/7.
 *
 *  * MVP-M层
 */

public class GreetingGeneratorTask extends AsyncTask<Void,Void,Integer>{



    //callback listener
    public interface GreetingTeskListener{
        public void onCreetingCenerated(String greetingText);
    }

    private String baseText;
    private GreetingTeskListener listener;

    public GreetingGeneratorTask(String baseText, GreetingTeskListener listener) {
        this.baseText = baseText;
        this.listener = listener;
    }

    // 执行耗时操作
    @Override
    protected Integer doInBackground(Void... params) {
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){}
        return (int)(Math.random()*100);
    }

    @Override
    protected void onPostExecute(Integer randomInt) {
        listener.onCreetingCenerated(baseText+""+randomInt);
    }
}
