package com.banyuan;

import com.sun.tools.corba.se.idl.StructEntry;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Tools {

    static List<Student> list=new ArrayList<Student>();

    ObjectInputStream  ois=null;

    static{

        for(int i=0;i<3;i++){
            Student   s=new Student();
            s.setNumber("1001"+i);
            s.setName("李四"+i);
            s.setPassword("12345"+i);
            s.setAge(i+15);
            s.setClazz(""+i);
            list.add(s);
        }
    }

    public     void   register(Student   stu,File  file) throws IOException, ClassNotFoundException {
        //直接把数据追加到txt

        List<Student>  list=read(file);
        list.add(stu);

        //打开了一个读取文件的对象流  然后 new FileOutputStream() 有一个特性   会去把之前的文件没有就重新创建  有的就重新覆盖
        ObjectOutputStream    os=new ObjectOutputStream(new FileOutputStream(file));

        for (Student  s:list) {
            os.writeObject(s);
        }
       os.close();

    }





    //登录功能
    public   boolean   login(String name,String  password,File  file) throws IOException, ClassNotFoundException {

        List<Student>  list=read(file);

        System.out.println(list+"-----");

        boolean   flag=false;
        for(Student  s:list){
            if(name.equals(s.getName()) && password.equals(s.getPassword())){
                flag=true;

            }
        }
        System.out.println("--==++++++"+flag);
    return  flag;
    }



    //读取文件的方法:
    public    List<Student>  read(File file) throws IOException, ClassNotFoundException {
        List<Student> list=new ArrayList<>();
         ois=new ObjectInputStream(new FileInputStream(file));
        Object  obj=ois.readObject();

        while(obj!=null){
            try {
                Student s=(Student)obj;
                list.add(s) ;
                obj=ois.readObject();
            }catch (EOFException e)
            {
                break;
            }

        }
        ois.close();
        return list;
    }


//    public static  void  close() throws IOException {
//        ois.close();
//        os.close();
//    }


    public  void  add(File  file){
        ObjectOutputStream os=null;
        try {

            if(!file.exists()){
                file.createNewFile();
            }
            os =new ObjectOutputStream(new FileOutputStream(file,true));
            for (Student  s:list) {
                os.writeObject(s);
            }
           os.writeObject(null);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }





}
