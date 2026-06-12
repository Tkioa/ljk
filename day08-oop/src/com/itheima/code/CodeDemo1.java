package com.itheima.code;

public class CodeDemo1 {
    static{
        System.out.println("静态代码块");
    }
    //静态代码块与类一起优先执行,可以对静态资源进行初始化。
    {
        System.out.println("普通代码块");
    }
    //实例代码块,当创建对象时,自动执行，无对象不执行。
    public static void main(String[] args) {
        new CodeDemo1();
        System.out.println("喵喵咪爱哦");
        new CodeDemo1();
    }
}
