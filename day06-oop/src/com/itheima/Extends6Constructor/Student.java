package com.itheima.Extends6Constructor;

public class Student extends People{
    private int score;

    public Student() {}

    public Student(int score,String name,String gender,int age){
        super(name,gender,age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
