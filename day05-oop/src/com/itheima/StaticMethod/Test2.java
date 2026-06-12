package com.itheima.StaticMethod;
//VerifyCodeUtil工具类,使用类名调用静态方法，相比实例方法可以节省内存，不需要创建对象。
public class Test2 {
    public static void main(String[] args) {
        VerifyCodeUtil.getCode(4);
    }
}
