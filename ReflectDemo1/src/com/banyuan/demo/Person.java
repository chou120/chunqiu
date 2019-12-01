package com.banyuan.demo;

public class Person   {


    private   String name;
    private  int   age;
    public     String  address;
      String  city;
      protected   String   country;



    public Person() {
        System.out.println("我是无参构造方法....");

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("我是有参构造方法....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    private    void   show(String    uname,int   money){
        System.out.println("我是私---有化方法"+uname+"我有"+money+"钱");
    }


    protected    static    void   show2(){
        System.out.println("我是protected 静态方法...");
    }




}
