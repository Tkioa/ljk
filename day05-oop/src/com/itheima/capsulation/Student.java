package com.itheima.capsulation;

/**封装的设计要求:合理隐藏,合理暴露。
 * 例如年龄输入要合法，不能是负值.
 */
public class Student {
    String name;
    private int age;
    public void setAge(int age){
        if(age>=18&&age<=60){
            this.age = age;
        }else{
            System.out.println("您的年龄不符合上网要求");
        }
    }
    public int getAge(){
        return age;
    }
}
