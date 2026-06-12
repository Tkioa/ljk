package com.itheima.innerclass;
//总之成员内部类可以外部类的静态成员和实例成员。
public class Outer {
    public static String schoolName = "贵阳信息科技学院";
    public static void OO(){
        System.out.println("展示");
    }
    private int age = 10;
    public void qq(){
        System.out.println("QQ");
    }
    //成员内部类,相当于Outer类的成员变量;无static修饰,属于外部类对象持有。
    public class Inner{
        private String name;
        public void show() {
            System.out.println("成员内部类");
            //成员内部类可以直接访问外部类的静态成员。
            System.out.println(schoolName);
            OO();
            System.out.println(age);
            qq();
            System.out.println(this);//拿到的是内部类的对象
            System.out.println(Outer.this);//外部类Outer的对象
        }
        public Inner(){
            //无参构造器
            System.out.println("Inner(String name)");
        }
        public Inner(String name){
            this.name = name;
        }//有参构造器

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
