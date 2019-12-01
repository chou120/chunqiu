package com.banyuan.gui1.controller;

import com.banyuan.gui1.pojo.Admin;
import com.banyuan.gui1.pojo.Question;
import com.banyuan.gui1.pojo.Student;
import com.banyuan.gui1.server.ServerDemo;
import com.banyuan.gui1.service.QuestionService;
import com.banyuan.gui1.service.UserService;

import java.io.IOException;
import java.io.ObjectInputStream;

public class UserController {


    private ServerDemo serverDemo;
    private UserService   us;
    private QuestionService  questionService;

    public UserController(ServerDemo serverDemo,UserService   us) {
        this.serverDemo = serverDemo;
        this.us=us;
    }

    //写一个用来接受客户端信息的方法
    public void recevieClient() {
            while (true){
                try {

                    ObjectInputStream  is= serverDemo.getOis();
                    if(is!=null) {
                        Object obj =is.readObject();
                        if (obj instanceof Student) {
                            Student student = (Student) obj;
                            switch (student.getFlag()){
                                case  "stulogin":
                                    //从客户端接收过来的 对象数据  是不是已经包含了  账户 和密码
                                    //调用  Service 里面的login 方法
                                    boolean flag = us.loginStu(student.getSname(), student.getSpwd());

                                    if (flag) {
                                        System.out.println("------");
                                        serverDemo.getOos().writeUTF("true");
                                        serverDemo.getOos().flush();
                                    } else {
                                        System.out.println("++++++++");
                                        serverDemo.getOos().writeUTF("false");
                                        serverDemo.getOos().flush();
                                    }
                                    break;
                                case "exam":


                                    break;
                            }
                        }

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }

    }


    //考试试题




}
