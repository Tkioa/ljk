package com.itheima.Demo;

public class SmartHomeSystem {
    private SmartHomeSystem() {}
    private static final SmartHomeSystem shs = new SmartHomeSystem();
    public static SmartHomeSystem getInstance(){
        return shs;
    }
    public static void SwitchStatus(JD jd){
        System.out.println(jd.getName()+"当前状态："+jd.isStatus());
        jd.press();
        System.out.println(jd.getName()+"当前状态："+jd.isStatus());
    }
    public static void printAll(JD [] jd){
        for(int i=0;i<jd.length;i++){
            System.out.println((i+1)+"\t"+jd[i].getName()+"当前状态："+jd[i].isStatus());
        }
    }
}
