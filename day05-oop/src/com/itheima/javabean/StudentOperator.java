package com.itheima.javabean;

/**
 * 实体类特点:私有化成员，并提供public修饰的setter和getter方法;
 * 以及三层模型;
 */
public class StudentOperator {
    private Student stu;
    public StudentOperator(Student stu){
        this.stu = stu;
    }
    public void sum(){
        System.out.println(stu.getName()+"总成绩:"+(stu.getChinese()+stu.getMath()));
    }
    public void avg(){
        System.out.println(stu.getName()+"平均成绩:"+(stu.getChinese()+stu.getMath())/2);
    }
}
