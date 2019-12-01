package banyuan.cn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo3 {

    public static void main(String[] args) {
        SimpleDateFormat  sdf=new SimpleDateFormat("yyyy-MM-dd");
       String  str= sdf.format(new Date());

        System.out.println(str);

        String  str2="2019-10-28";
        SimpleDateFormat  sdf2=new SimpleDateFormat("yyyy/MM/dd");
        Date  date=null;
        try {
            date=sdf2.parse(str2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);


    }

}
