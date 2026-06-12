package com.itheima.loop;

public class ForDemo1 {
    public static void main(String[] args) {
        test1(10);
    }
    public static void test1(int j){
        int sum = 0;
        for(int i=1;i<=j;i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
