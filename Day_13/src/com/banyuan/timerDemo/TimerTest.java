package com.banyuan.timerDemo;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {

    public static void main(String[] args) {
        Timer   t=new  Timer();

        t.schedule(new DeleteFile(), 5000);



    }

}


class   DeleteFile  extends TimerTask{

    @Override
    public void run() {
            File file  =new  File("//Users//sanye//img");
            delFile(file);
            //如果执行完毕就取消

    }


    public   void  delFile(File  file){

        File [] f=file.listFiles();
        if(f!=null){
            for (File  fi:f){
                if(fi.isDirectory()){
                    delFile(fi);
                }else{
                    fi.delete();
                }

            }
        }



    }


}

