package com.banyuan.gui1.demo;

import javax.swing.*;
import java.awt.*;

public class Demo2_login extends JFrame {
        private JPanel  p;
        private JLabel lblName,lblPwd;
        private JTextField txtName;
        private JPasswordField  txtPwd;
        private JButton  btnOk,btnCancle;

        public Demo2_login(){
            super("登录");
            p=new JPanel();
            p.setLayout(null);
            lblName=new JLabel("用户名");
            lblPwd=new JLabel(" 密  码");
            txtName=new JTextField(20);
            txtPwd=new JPasswordField(20);
            txtPwd.setEchoChar('*');
             btnOk=new JButton("确定");
             btnCancle=new JButton("取消");


        }



}
