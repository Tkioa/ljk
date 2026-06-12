package com.itheima.loop;

public class ForDemo2 {
    public static void main(String[] args) {
        test1(10);
    }
    public static void test1(int k){
        int sum = 0;
        for(int i=1;i<=k;i++){
            if(i%2!=0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
