package banyuan.com;

import java.io.*;

public class IO_Demo10 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //合并流：
                File  file=new File("1.txt");

                Student  s=new Student("李四",12);

                ObjectOutputStream    oos =new ObjectOutputStream(new FileOutputStream(file));

                oos.writeObject(s);

                oos.close();

            //反序列化
                ObjectInputStream  ois=new ObjectInputStream(new FileInputStream(file));

                Student  ob=(Student)ois.readObject();

                 System.out.println(ob.getName());

                 ois.close();

    }

}
