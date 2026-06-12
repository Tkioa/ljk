package com.itheima.interface2;
//接口的作用:可以获得多个角色的特性,更利于解耦合
public class Test {
    public static void main(String[] args) {
        People a = new Student();
        Driver b = new Student();
        Cooker c = new Student();
        People a1 = new Teacher();
        Driver b1 = new Teacher();
    }
}

class People{}
interface Driver{}
interface Cooker{}

class Student extends People implements Driver,Cooker{}
class Teacher extends People implements Driver{}