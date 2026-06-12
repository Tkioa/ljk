package com.itheima.branch;

public class IfTest1 {
    public static void main(String[] args) {
        test1();
    }
    public static void test1(){
        boolean red = true;
        boolean green = false;
        boolean yellow = false;
        if(red){
            System.out.println("红灯亮,停止行驶");
        }else if(green){
            System.out.println("绿灯亮,开始行驶");
        }else if(yellow){
            System.out.println("黄灯亮,准备减速");
        }else{
            System.out.println("灯泡故障");
        }
    }
}
