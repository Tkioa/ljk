package com.itheima.object;
//关于构造器
public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        stu1.name = "波仔";
        stu1.Chinese = 59;
        stu1.Math = 100;
        stu1.sum();
        stu1.avg();
        stu2.name = "波妞";
        stu2.Chinese = 100;
        stu2.Math = 100;
        stu2.sum();
        stu2.avg();
    }
}
