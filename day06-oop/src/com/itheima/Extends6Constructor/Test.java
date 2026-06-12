package com.itheima.Extends6Constructor;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student(99, "刘十三", "男", 22);
        System.out.println(stu.getName()+"\t"+stu.getGender()+"\t"+stu.getAge()+"\t"+stu.getScore());
        Teacher tea = new Teacher("李", "女", 22,"java");
        System.out.println(tea.getName()+"\t"+tea.getGender()+"\t"+tea.getAge()+"\t"+tea.getKill());
    }
}
