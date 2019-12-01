package com.banyuan.transactionDemo.pojo;

public class User {

    private  int   uid;
    private  String  uname;
    //...
    private  String  password;
    private  Double  money;

    public User() {
    }

    /**
     * 在使用QueryRunner的时候   一定要加上实体类的无参构造器
     * @param uname
     * @param password
     * @param money
     */

    public User(String uname, String password, Double money) {
        this.uname = uname;
        this.password = password;
        this.money = money;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                '}';
    }
}
