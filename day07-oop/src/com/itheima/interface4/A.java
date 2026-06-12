package com.itheima.interface4;

/**接口新增的3类方法
 * 增加这3类方法加强了接口能力,便于后期维护。
 * 例如:多个类实现了某个接口,后期要向接口增加某个功能,就必须将所有实现类进行方法重写，
 * 导致工作量变大。而新增的这几类方法就可以解决这一问题。
 */
public interface A {
    //默认方法就是普通方法,规定这样修饰的
    default void show(){
        System.out.println("默认方法");
        run();
    }
    private void run(){//私有方法只能间接调用。
        System.out.println("私有方法");
    }
    static void go(){
        System.out.println("静态方法");
    }
}
