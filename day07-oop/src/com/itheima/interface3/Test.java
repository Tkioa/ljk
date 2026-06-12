package com.itheima.interface3;

public class Test {
    public static void main(String[] args) {
        Student [] stu = new Student[10];
        stu[0] = new Student("小王", "男", 83.5);
        stu[1] = new Student("小张", "女", 90.0);
        stu[2] = new Student("小李", "男", 80.5);
        stu[3] = new Student("小刘", "男", 73.5);
        stu[4] = new Student("小龙", "男", 60.5);
        stu[5] = new Student("小余", "女", 50.0);
        stu[6] = new Student("小红", "男", 48.5);
        stu[7] = new Student("小蓝", "女", 30.0);
        stu[8] = new Student("小绿", "男", 70.5);
        stu[9] = new Student("小紫", "女", 67.5);
        StudentDemo SD = new StudentOperator2(stu);
        SD.printAll();
        SD.printAvg();
    }
}
