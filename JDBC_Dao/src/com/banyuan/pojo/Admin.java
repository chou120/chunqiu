package com.banyuan.pojo;

public class Admin {

    /*
        m   model     (数据库的操作类或者接口   +  实体类)
        v   view
        C  controller

     */


    private  Integer pid;
    private  String  username;
    private  String  password;

    public Admin() {
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "pid=" + pid +
                ", username='" + username + '\'' +
                '}';
    }
}
