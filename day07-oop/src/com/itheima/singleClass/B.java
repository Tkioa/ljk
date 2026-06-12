package com.itheima.singleClass;
//懒汉式单例
public class B {
    //1.私有化构造器
    private B() {}
    //先构建对象，但不初始化.
    private static B b;
    public static B getInstance(){
        if(b==null){
            b = new B();
        }
        return b;
    }
}
