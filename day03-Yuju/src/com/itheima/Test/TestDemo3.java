package com.itheima.Test;

import java.util.Random;

/**
 * 随机生成指定位数的验证码，包括大写字母，小写字母，数字;
 */
public class TestDemo3 {
    public static void main(String[] args) {
        test1(4);
    }
    public static void test1(int n){
        Random ra = new Random();
        String code = "";
        for(int i=0;i<n;i++){
            int a = ra.nextInt(3);
            switch(a){
                case 0://大写字母
                    code += (char)(65+ra.nextInt(26));
                    break;
                case 1://小写字母
                    code += (char)(97+ra.nextInt(26));
                    break;
                case 2://数字
                    code += ra.nextInt(10);
                    break;
            }
        }
        System.out.println(code);
    }
}
