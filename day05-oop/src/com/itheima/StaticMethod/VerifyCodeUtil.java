package com.itheima.StaticMethod;

import java.util.Random;

public class VerifyCodeUtil {
    private VerifyCodeUtil() {}//构造方法私有化,禁止创建对象。
    public static void getCode(int n){
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
