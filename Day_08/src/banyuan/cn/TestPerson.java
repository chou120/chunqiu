package banyuan.cn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class TestPerson {


    public static void main(String[] args) {

        Collection con=new ArrayList();
        con.add(new Person("张三",12,"南京栖霞区"));
        con.add(new Person("张三2",12,"南京炫舞区"));
        con.add(new Person("张三3",12,"南京鼓楼区"));
        con.add(new Person("张三5",12,"南京微信12区"));
        con.add(new Person("张三6",12,"上海宝山区"));


        Scanner  sc=new Scanner(System.in);
        System.out.println("请输入要查看的城市:");
        String  city=sc.next();  //南京   1.进行字符串截取  subString    charAt     startWith   contain   compareTo


        System.out.println(getShowInfo(city,con));




    }

    public static  Collection   getShowInfo(String city,Collection con){
        Collection  co=new ArrayList();
        Object[]  obj=con.toArray();
        for (int i = 0; i <con.size(); i++) {
            Person p= (Person)obj[i];
            if(city.equals(p.getAddress().substring(0,2))){
               co.add(p);
            }
        }

    return co;
    }










}
