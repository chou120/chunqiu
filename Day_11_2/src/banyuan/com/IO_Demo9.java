package banyuan.com;

import java.io.*;

public class IO_Demo9 {

    public static void main(String[] args) throws IOException {

        //合并流：
                File  file=new File("1.txt");
                File  file2=new File("2.txt");
                File  file3=new File("3.txt");

               InputStream  is1= new  FileInputStream(file);
               InputStream  is2=new FileInputStream(file2);

        SequenceInputStream    sis=new SequenceInputStream(is1,is2);
        BufferedOutputStream  bof=new BufferedOutputStream(new FileOutputStream(file3,true));



        byte[]  by=new byte[(int)file.length()+(int)file2.length()];
             int  key=0;

      //  System.out.println(sis.read(by));

             while((key=sis.read(by))!=-1){
                 bof.write(by,0,key);
                 //bof.write("\n".getBytes());
             }

        //System.out.println(new String(by));
        sis.close();
        bof.close();

    }

}
