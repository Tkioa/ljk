package com.itheima.Test;

import java.util.Scanner;

//制作简易计算器
public class TestDemo1 {
    public static void main(String[] args) {
        test1();
    }
    public static void test1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int i = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int j = sc.nextInt();
        System.out.println("请输入运算符:");
        String k = sc.next();
        switch(k){
            case "+":
                System.out.println(i+"+"+j+"="+(i+j));
                break;
            case "-":
                System.out.println(i+"-"+j+"="+(i-j));
                break;
            case "*":
                System.out.println(i+"*"+j+"="+(i*j));
                break;
            case "/":
                if(j==0){
                    System.out.println("除数不能为0");
                    break;
                }
                System.out.println(i+"/"+j+"="+(i/j));
                break;
            default:
                System.out.println("输入运算符有误");
        }
    }
}
