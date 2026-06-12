package com.itheima;

import java.util.Scanner;

//定义动态数组
public class ArrayDemo2 {
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        double [] score = new double[8];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<score.length;i++){
            System.out.println("第"+(i+1)+"个学生分数:");
            score[i] = sc.nextDouble();
        }
        //求分数平均值
        double sum = 0;
        for(int i=0;i<score.length;i++){
            sum += score[i];
        }
        System.out.println("平均成绩为:"+sum/score.length);
        //求分数最大值
        double max = score[0];
        for(int i=1;i<score.length;i++){
            if(score[i]>max){
                max = score[i];
            }
        }
        System.out.println("分数最大值:"+max);
        //求分数最小值
        double min = score[0];
        for(int i=1;i<score.length;i++){
            if(min>score[i]){
                min = score[i];
            }
        }
        System.out.println("分数最小值:"+min);
    }
}
