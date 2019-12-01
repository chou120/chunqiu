package com.banyuan.timerDemo;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo1 {
    /**
     * 定时器: 可以在指定的时间里面做某些事情        还可以重复的去做某件事
     * 依赖 Timer   和 TimerTask
     *
     */
    public static void main(String[] args) {
        Timer    t=new  Timer();
        //3秒之后执行  此任务  再每隔两秒去执行此任务  如此反复
        t.schedule(new MyTimerTask(t), 3000,2000);


    }


}

class  MyTimerTask  extends   TimerTask{
    private  Timer   t;

    public   MyTimerTask(Timer  t){
        this.t=t;
    }


    @Override
    public void run() {
        System.out.println("你妈炸了...");
        //执行到这一步  给定时器一个取消任务
         //   t.cancel();
    }



}


