package com.itheima.branch;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        test1();
    }
    public static void test1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入您的性别:");
        String gender = sc.next();
        switch(gender){
            case "男":
                System.out.println("推荐《斗破苍穹》");
                break;
            case "女":
                System.out.println("推荐《吞噬星空》");
                break;
            default:
                System.out.println("无法推荐");
        }
    }
}
