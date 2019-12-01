package com.banyuan.gui1.demo;


import javax.swing.*;
import java.awt.*;

public class Demo1 {

    public static void main(String[] args) {

        JFrame f=new JFrame("我是最大的面板");
        f.setLocation(300, 400);
        Button b1=new Button("确定");
        Button  b2=new Button("打开");
        Button  b3=new Button("取消");
        Button  b4=new Button("关闭");

       // f.setLayout(new FlowLayout());
     //   f.setLayout(null);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.setSize(300,200);
        f.setVisible(true);


    }

}
