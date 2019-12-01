package com.banyuan;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;

public class Homework {

//    将一个集合里面的学生对象存储到指定的文件中去，每个学生信息单独占一行，学生的属性之间用英文逗号隔开
//    学生属性:学生编号 学生姓名 学生密码  学生年龄  学生班级
//    要求:1.学生选择登陆功能,如果文件中没有该学生的信息那么就得注册
//         2.根据输入的学生的姓名获取指定学生的所有信息
//         3.根据所有学生的年龄进行降序排序

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("student.txt");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入功能编号:");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                new Tools().add(file);
                boolean flag = new Tools().login("李四", "12345", file);
                if (!flag) {
                    System.out.println("-----");
                    new Tools().register(new Student("1024", "张三", "123", 21, "5"), file);
                    List<Student> list = new Tools().read(file);

                    for (Student s : list) {
                        System.out.println("---" + s.toString());
                    }

                } else {
                    System.out.println(flag);

                }
                break;
            case 2:

                break;
            case 3:

                break;


        }


    }






}
