package banyuan.com.Homework;

import java.util.Collection;

public class Student {

            private  String   stuNum;
            private  String  stuName;
            private Collection<Subject>  con;

    public Collection<Subject> getCon() {
        return con;
    }

    public void setCon(Collection<Subject> con) {
        this.con = con;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Student() {
    }

    public Student(String stuNum, String stuName) {
        this.stuNum = stuNum;
        this.stuName = stuName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNum='" + stuNum + '\'' +
                ", stuName='" + stuName + '\'' +
                '}';
    }
}
