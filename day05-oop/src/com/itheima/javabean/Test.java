package com.itheima.javabean;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("刘十三");
        stu1.setMath(80);
        stu1.setChinese(90);
        StudentOperator operator = new StudentOperator(stu1);
        operator.sum();
        operator.avg();
    }
}
