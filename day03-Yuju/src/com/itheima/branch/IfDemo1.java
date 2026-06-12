package com.itheima.branch;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        //test1(19);
        test2();
    }

    public static void test1(int age) {
        if (age >= 18) {
            System.out.println("可以上网");
        } else {
            System.out.println("未成年");
        }
    }

    public static void test2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入您的分数：");
        int score = sc.nextInt();
        System.out.println("成绩等级为:");
        if(score>=90&&score<=100){
            System.out.println("A+");
        }else if(score>=80&&score<90){
            System.out.println("A");
        }else if(score>=70&&score<80){
            System.out.println("B");
        }else if(score>=60&&score<70){
            System.out.println("C");
        }else if(score>=0&&score<60){
            System.out.println("D");
        }else{
            System.out.println("输入的分数有误");
        }
    }
}
