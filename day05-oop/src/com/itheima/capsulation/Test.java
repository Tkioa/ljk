package com.itheima.capsulation;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "波仔";
        stu1.setAge(17);
        System.out.println(stu1.getAge());
    }
}
