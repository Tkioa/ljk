package com.itheima.innerclass3;

/**匿名内部类,匿名内部类其实有名字，只是隐藏了。
 * 原理:就是将抽象类或接口的抽象方法进行重写,就可以打破不能创建对象的窘境。
 * 作用:不需要在创建子类对抽象方法重写,更加简化代码。例子见innerclass4.
 * 使用场景:匿名内部类一般适用于抽象类或接口,具体类合法但不适合。
 */
public class Test {
    public static void main(String[] args) {
        Animal cat = new Animal(){
            @Override
            public void voice(){
                System.out.println("🐱🐱🐱 喵喵喵");
            }
        };
        cat.voice();
    }
}
