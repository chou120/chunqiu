package banyuan.com.dateDemo;

import java.util.Calendar;
import java.util.Random;

public class RondomDemo {

    public static void main(String[] args) {

        Random   ron=new Random();
        System.out.println("随机值是:"+ron.nextInt(10));  //Math.randow()*10


        Calendar  cal=Calendar.getInstance();//获取一个Calendar的一个对象
        System.out.println(cal.getTime());//等同于  new  Date().getTime()

        System.out.println(cal.get(Calendar.YEAR)); //获取当前年份
        System.out.println(cal.get(Calendar.MONTH)+1);//获取当前的月份  为什么要加1  思考下？
        System.out.println(cal.get(Calendar.DATE));//获取具体的哪一天


        //2年前的5天前
        cal.add(Calendar.YEAR,-2); //设置天数
        cal.add(Calendar.DATE,-5); //设置年份

        cal.add(Calendar.MONTH+1,-2);








    }

}
