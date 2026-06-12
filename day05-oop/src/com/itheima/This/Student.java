package com.itheima.This;
//this关键词的使用,解决命名冲突问题
public class Student {
    String name;
    String gender;
    int age;
    public Student(){
        System.out.print("");
    }
    public Student(String name,String gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public void print(String name){
        System.out.println(this.name+"喜欢"+name);
    }
}
