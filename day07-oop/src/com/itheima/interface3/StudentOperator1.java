package com.itheima.interface3;

public class StudentOperator1 implements StudentDemo{
    Student [] stu;
    public StudentOperator1(Student [] stu){
        this.stu = stu;
    }
    @Override
    public void printAll(){
        System.out.println("姓名\t性别\t分数");
        for(int i=0;i<stu.length;i++){
            System.out.println(stu[i].getName()+"\t"+stu[i].getGender()+"\t"+stu[i].getScore());
        }
        System.out.println("--------------------");
    }
    @Override
    public void printAvg(){
        System.out.println("班级平均成绩:");
        double sum = 0;
        for(int i=0;i<stu.length;i++){
            sum += stu[i].getScore();
        }
        double avg = sum/stu.length;
        System.out.println(avg);
    }
}
