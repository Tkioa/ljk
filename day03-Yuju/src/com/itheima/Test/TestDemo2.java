package com.itheima.Test;

import java.util.Random;
import java.util.Scanner;

//随机生成数并猜中(死循环的应用)
public class TestDemo2 {
    public static void main(String[] args) {
        test1();
    }
    public static void test1(){
        Random random = new Random();
        int number = random.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            if(a>number){
                System.out.println("猜大了");
            }else if(a<number){
                System.out.println("猜小了");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
    }
}
