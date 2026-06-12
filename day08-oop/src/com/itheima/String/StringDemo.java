package com.itheima.String;
//String对象的地址说明以及String类中的方法使用
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "刘京凯";//地址在常量池中，常量池对于相同的数据只会存放一个一次节约内存,故地址一样。
        String s2 = new String("刘京凯");//地址在堆内存中,没new一个地址都会发生变化。
        String s3 = "刘京凯";
        String s4 = new String("刘京凯");
        System.out.println(s1==s3);
        System.out.println(s2==s4);
        System.out.println(s1==s2);
        System.out.println(show(s1,s2));
    }
    public static boolean show(String s1,String s2){
        if(s1.equals(s2)){//equals()方法判断两个字符串内容是否相同,它不看地址是否相同;
            return true;
        }else
            return false;
    }
}

