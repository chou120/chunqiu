package banyuan.com.Homework;

public class Subject {

    private  String  subNum;
    private  String  subName;
    private  double score;

    public Subject(String subNum, String subName, double score) {
        this.subNum = subNum;
        this.subName = subName;
        this.score = score;
    }

    public Subject() {
    }

    public String getSubNum() {
        return subNum;
    }

    public void setSubNum(String subNum) {
        this.subNum = subNum;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subNum='" + subNum + '\'' +
                ", subName='" + subName + '\'' +
                ", score=" + score +
                '}';
    }
}
