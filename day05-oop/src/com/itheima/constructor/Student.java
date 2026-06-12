package com.itheima.constructor;

public class Student {
    String name;
    int age;
    String gender;
    public void print(){
        System.out.println(name+" "+age+" "+gender);
    }
    public Student(){
        System.out.print("");
    }
    public Student(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
