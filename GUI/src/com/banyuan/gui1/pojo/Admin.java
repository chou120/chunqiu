package com.banyuan.gui1.pojo;

import java.io.Serializable;

public class Admin implements Serializable {

    private  Integer  sid;
    private  String   uname;
    private  String    pwd;


    public Admin(String uname, String pwd) {
        this.uname = uname;
        this.pwd = pwd;
    }




    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "sid=" + sid +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
