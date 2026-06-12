package com.itheima.scanner;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        scanner();
    }
    public static void scanner(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
    }
}
