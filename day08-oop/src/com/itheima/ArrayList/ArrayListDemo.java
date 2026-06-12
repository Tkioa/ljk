package com.itheima.ArrayList;

import java.util.ArrayList;

//ArrayList集合的使用
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        //添加元素
        list.add("java0");
        list.add("java1");
        list.add("java2");
        list.add("java3");
        System.out.println(list.get(0));
        System.out.println("-----------");
        //删除元素
        list.remove(0);
        show(list);
        //修改元素
        list.set(0,"java0");
        show(list);
        //查询元素
        System.out.println(list.contains("java0"));
    }
    public static void show(ArrayList list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
