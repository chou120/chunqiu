package banyuan.com.dateDemo;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class DateDeme2 {

    public static void main(String[] args) throws ParseException {

        //将date时间以指定格式进行输出
        Date  date=new  Date();

        SimpleDateFormat   sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒");

       String  str= sdf.format(date);

        System.out.println(str);


        str="2019年10月30日 13时57分34秒230毫秒";

        sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒");
           date=sdf.parse(str);

        System.out.println(date);



        //请计算   从你出生开始到现在 一共过去了多少年多少月多少日
















    }


}
