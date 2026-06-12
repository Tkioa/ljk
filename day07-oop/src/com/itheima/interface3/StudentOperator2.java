package com.itheima.interface3;

import java.util.Objects;

public class StudentOperator2 implements StudentDemo{
    Student [] stu;
    public StudentOperator2(Student [] stu){
        this.stu = stu;
    }
    @Override
    public void printAll(){
        System.out.println("姓名\t性别\t成绩");
        int count = 0;
        for(int i=0;i<stu.length;i++){
            System.out.println(stu[i].getName()+"\t"+stu[i].getGender()+"\t"+stu[i].getScore());
            if(Objects.equals(stu[i].getGender(), "女")){
                count++;
            }
        }
        System.out.println("男生人数:"+(stu.length-count)+"\t女生人数:"+count);
        System.out.println("---------------------");
    }
    @Override
    public void printAvg(){
        System.out.println("班级平均成绩:");
        double max = stu[0].getScore();
        double min = stu[0].getScore();
        double sum = 0;
        for(int i=1;i<stu.length;i++){
            sum += stu[i].getScore();
            if(max<stu[i].getScore()){
                max = stu[i].getScore();
            }
            if(min>stu[i].getScore()){
                min = stu[i].getScore();
            }
        }
        System.out.println((sum-max-min)/ (stu.length-2));
    }
}
