package com.banyuan.demo.com.banyuan;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import java.io.*;
import java.nio.charset.Charset;

public class CSVDemo1 {

    /**
     * csv是逗号分隔值文件的格式，英文全称comma-separated values。
     * 该文件通常都是以纯文本的形式储存，以行为单位，每行有多项数据，
     * 每项数据用逗号分隔。用户可以使用Excel，
     * 或者系统自带的记事本、写字板，来打开csv文件
     */
    public static void main(String[] args) throws IOException {

        // 第一参数：新生成文件的路径 第二个参数：分隔符（不懂仔细查看引用百度百科的那段话） 第三个参数：字符集
        CsvWriter csvWriter = new CsvWriter("src/test.csv", ',', Charset.forName("UTF-8"));

        // 表头和内容
       // String[]  headers = {"姓名", "年龄", "性别"};
        //String[] content = {"张三", "18", "男"};

        // 写表头和内容，因为csv文件中区分没有那么明确，所以都使用同一函数，写成功就行
       // csvWriter.writeRecord(headers);
        // csvWriter.writeRecord(content);

        // 关闭csvWriter
        csvWriter.close();

    }


}
