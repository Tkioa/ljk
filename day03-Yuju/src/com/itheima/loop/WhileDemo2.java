package com.itheima.loop;

public class WhileDemo2 {
    public static void main(String[] args) {
        test1();
    }
    public static void test1(){
        double i = 0.1;
        int j = 0;
        while(i<8848860.0){
            i = i*2;
            j++;
        }
        System.out.println("需要折"+j+"次可以达到珠穆朗玛峰的高度");
    }
}
