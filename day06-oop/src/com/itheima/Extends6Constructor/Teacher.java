package com.itheima.Extends6Constructor;

public class Teacher extends People{
    private String kill;

    public Teacher() {}

    public Teacher(String name,String gender,int age,String kill){
        super(name,gender,age);
        this.kill = kill;
    }

    public String getKill() {
        return kill;
    }

    public void setKill(String kill) {
        this.kill = kill;
    }
}
