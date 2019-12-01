package banyuan.com.dateDemo;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateDeme {

    public static void main(String[] args) {

       Date date=new  Date();
       //date.setTime(1000);

        //System.out.println(LocalDate.now());

       // System.out.println(date);
        //   long   time= date.getTime();
       // System.out.println(time); // 1572414288255
        //如果让你判断出一个程序执行完毕所消耗的时间


        Timestamp   time=new Timestamp(1000);
        System.out.println(time.getTime());

        System.out.println(Timestamp.valueOf(LocalDateTime.now()));












    }


}
