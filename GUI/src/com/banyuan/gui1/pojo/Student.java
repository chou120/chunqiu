package com.banyuan.gui1.pojo;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {

    private  Integer  sid;
    private  String  sname;
    private  String  spwd;
    private  Double  score;
    private  String  address;
    private Date startTime;
    private Date endTime;

    private  String  flag;

    public Student(String flag) {
        this.flag = flag;
    }

    public Student() {
    }

    public Student(String sname, String spwd, Double score, String address, Date startTime, Date endTime) {
        this.sname = sname;
        this.spwd = spwd;
        this.score = score;
        this.address = address;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Student(String sname, String spwd, String address) {
        this.sname = sname;
        this.spwd = spwd;
        this.address = address;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSpwd() {
        return spwd;
    }

    public void setSpwd(String spwd) {
        this.spwd = spwd;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", spwd='" + spwd + '\'' +
                ", score=" + score +
                ", address='" + address + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
