package com.banyuan.demo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo1  extends  JFrame{

    /**
     * GUI  javax.awt.*;
     *      javax.Swing.*;
     *
     *
     *
     */
    public static void main(String[] args) {

        JFrame   frame=new JFrame("这是考试系统");
        //frame.setSize(500, 400); //设置宽高
       // frame.setLocation(100, 100); // 设置相对于父窗口的位置   x  y
        frame.setBounds(100, 100, 1000, 800);
        frame.setLayout(null);//设置为流式布局管理器
        Button   button =new Button("这是点击按钮");
        Button   button2=new Button("这是点击按钮2");
        Button   button3=new Button("这是点击按钮3");
        Button   button4=new Button("这是点击按钮4");
        JTextField  jTextField=new JTextField("...");
        JTextField  jTextField2=new JTextField("....");
        jTextField.setBounds(20, 20, 100, 20);
        jTextField2.setBounds(30, 30, 100, 20);
        JTextArea  jTextArea=new JTextArea("那好年少时大大大实打实大师大师看到就暗示的按时肯定会卡死大卡司等" +
                "哈很大扩大数据等哈收到货喀什的啊沙卡仕达卡仕达按时卡上卡上的喀什逗号登记卡上的卡仕达卡上看到按实际大的很深刻das");
        jTextArea.setBounds(200, 200, 100, 100);
        //jTextArea2.setBounds(200, 200, 100, 100);

        JButton  jb=new JButton("点击8");
        jb.setBackground(Color.GREEN);
        jb.setBounds(150, 150, 100, 50);

        JPasswordField jp=new JPasswordField("这里的数据是***  ");
        jp.setBounds(120, 120, 100, 50);
        jp.setCursor(new Cursor(13));  //设置鼠标箭头的样式

        JLabel   jLabel=new JLabel("你好");
        jLabel.setFont(new Font("宋体", Font.BOLD, 20));

        jLabel.setBounds(300, 20, 100, 40);


      //  JCheckBox  jCheckBox=new JCheckBox("男");  //多选框
        //JCheckBox  jCheckBox2=new JCheckBox("女");

        ButtonGroup   buttonGroup=new ButtonGroup();

        JRadioButton   jRadioButton=new JRadioButton("男");
        JRadioButton   jRadioButton2=new JRadioButton("女");
        jRadioButton.setLocation(200, 100);
        jRadioButton2.setLocation(200, 50);
        jRadioButton.setSize(100, 20);
        jRadioButton2.setSize(100, 20);
        buttonGroup.add(jRadioButton);
        buttonGroup.add(jRadioButton2);

        frame.add(jRadioButton);
       frame.add(jRadioButton2);


       String [] dd={"张三","刘国泰","陈浩","王红","崔佳佳","余思佳","张伟"};
        JList  jList=new JList(dd);





      //  jScrollPane.add(jTextArea);
       //

        JTable   jTable=new JTable();
        jTable.setModel(new DefaultTableModel(new Object[][]{{"1001","李四","123","下水道",13},
                {"1002","李四","123","下水道",13},
                {"1003","李四","123","下水道",13},
                {"1004","李四","123","下水道",13},
                {"1004","李四","123","下水道",13},
                {"1004","李四","123","下水道",13},
                {"1004","李四","123","下水道",13},
                {"1004","李四","123","下水道",13},
                {"1004","李四","123","下水道",13},
                {"1004","李四","123","下水道",13},
                {"1004","李四","123","下水道",13}
                ,{"1004","李四","123","下水道",13},
                {"1004","李四","123","下水道",13},
                {"1004","李四","123","下水道",13}
                },
                new Object[]{"学生编号","学生姓名","密码","住址","年龄"}));

        jTable.setBounds(400, 400, 400, 300);

        JScrollPane  jScrollPane=new JScrollPane(jTable);  //滚动条
        jScrollPane.setBounds(250,200,400,150);


//      frame.add(jTable);
       frame.add(jScrollPane);
        //  frame.add(jTextArea);
        frame.add(jp);
        frame.add(jLabel);

        button.setBackground(Color.cyan);

        button.setBounds(0, 0, 100, 30);
        button4.setBounds(40, 40, 100, 30);
        button2.setBounds(70, 70, 100, 30);
        button3.setBounds(100, 100, 100, 30);

       frame.add(jTextField);
        frame.add(jTextField2);
        frame.add(button);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        frame.add(jb);

        frame.setVisible(true);

        //给awt 下的窗体添加关闭
//        frame.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                super.windowClosing(e);
//                System.out.println("关闭中...");
//                System.exit(0);
//            }
//        });




    }






}
