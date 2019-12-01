package com.banyuan.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Login {
    private static   JFrame jFrame;

    public static void main(String[] args) {
        jFrame=new JFrame();
        JButton  jButton=new JButton("点击");
        jFrame.setBounds(400, 200, 500, 400);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jButton.setBounds(200, 200, 100, 50);
        JOptionPane  jOptionPane=new JOptionPane();


        JTextField  jTextField=new JTextField();
        jTextField.setBounds(200, 20, 150, 100);
        jTextField.setBackground(Color.ORANGE);

//        jTextField.addFocusListener(new FocusAdapter() {
//            @Override
//            public void focusGained(FocusEvent e) {
//                System.out.println("当鼠标光标聚焦的时候发生...");
//            }
//
//            @Override
//            public void focusLost(FocusEvent e) {
//                System.out.println("当鼠标光标消失的时候发生...");
//            }
//        });


//        jTextField.addPropertyChangeListener(new PropertyChangeListener() {
//            @Override
//            public void propertyChange(PropertyChangeEvent evt) {
//                System.out.println("窗体显示与消失监听....");
//            }
//        });






        jFrame.add(jTextField);

//        jTextField.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("你猜我执行了么...");
//            }
//        });






//        jButton.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//                System.out.println("哈哈哈");
//            }
//        });


        jButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //点击弹出一个消息
                JOptionPane.showMessageDialog(jFrame, "您输入信息有误", "验证消息", JOptionPane.INFORMATION_MESSAGE);
                Demo1  demo1=new Demo1();

                demo1.setVisible(true);

                jFrame.setVisible(false);
            }
        });


        jFrame.add(jButton);


    }





}
