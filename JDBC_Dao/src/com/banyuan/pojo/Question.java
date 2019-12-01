package com.banyuan.pojo;

public class Question {

        private   Integer  pid;
        private   String   q_title;
        private   String   q_Answer_A;
        private   String   q_Answer_B;
        private   String   q_Answer_C;
        private   String   q_Answer_D;
        private   String   q_Answer;

    public Question(String q_title, String q_Answer_A, String q_Answer_B, String q_Answer_C, String q_Answer_D, String q_Answer) {
        this.q_title = q_title;
        this.q_Answer_A = q_Answer_A;
        this.q_Answer_B = q_Answer_B;
        this.q_Answer_C = q_Answer_C;
        this.q_Answer_D = q_Answer_D;
        this.q_Answer = q_Answer;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getQ_title() {
        return q_title;
    }

    public void setQ_title(String q_title) {
        this.q_title = q_title;
    }

    public String getQ_Answer_A() {
        return q_Answer_A;
    }

    public void setQ_Answer_A(String q_Answer_A) {
        this.q_Answer_A = q_Answer_A;
    }

    public String getQ_Answer_B() {
        return q_Answer_B;
    }

    public void setQ_Answer_B(String q_Answer_B) {
        this.q_Answer_B = q_Answer_B;
    }

    public String getQ_Answer_C() {
        return q_Answer_C;
    }

    public void setQ_Answer_C(String q_Answer_C) {
        this.q_Answer_C = q_Answer_C;
    }

    public String getQ_Answer_D() {
        return q_Answer_D;
    }

    public void setQ_Answer_D(String q_Answer_D) {
        this.q_Answer_D = q_Answer_D;
    }

    public String getQ_Answer() {
        return q_Answer;
    }

    public void setQ_Answer(String q_Answer) {
        this.q_Answer = q_Answer;
    }


    @Override
    public String toString() {
        return "Question{" +
                "pid=" + pid +
                ", q_title='" + q_title + '\'' +
                ", q_Answer_A='" + q_Answer_A + '\'' +
                ", q_Answer_B='" + q_Answer_B + '\'' +
                ", q_Answer_C='" + q_Answer_C + '\'' +
                ", q_Answer_D='" + q_Answer_D + '\'' +
                ", q_Answer='" + q_Answer + '\'' +
                '}';
    }
}
