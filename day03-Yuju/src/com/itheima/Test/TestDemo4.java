package com.itheima.Test;

/**
 * 找素数,设置一个布尔型数据，默认为true，如果能被i整除，则将布尔型数据改为false，并跳出循环；
 */
public class TestDemo4 {
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        int a = 0;
        int i = 0;
        int j = 0;
        for(i=101;i<=200;i++){
            boolean flag = true;
            for( j=2;j<i;j++){
                if(i%j==0) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
                a++;
            }
        }
        System.out.println("一共"+a+"个素数");
    }
}
