package com.banyuan;

import java.io.Serializable;

public class Student implements Serializable {

    private String  number;
    private String  name;
    private String password;
    private int  age;
    private String  clazz; //班级

    public Student() {
    }

    public Student(String number, String name, String password, int age, String clazz) {
        this.number = number;
        this.name = name;
        this.password = password;
        this.age = age;
        this.clazz = clazz;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", clazz='" + clazz + '\'' +
                '}';
    }
}
