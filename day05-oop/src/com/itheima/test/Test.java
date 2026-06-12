package com.itheima.test;
//电影查询功能
public class Test {
    public static void main(String[] args) {
        Movie [] mov = new Movie[6];
        mov[0] = new Movie(1,"战狼2",34.5,"吴京");
        mov[1] = new Movie(2,"唐顿庄园2",23.5,"维维安");
        mov[2] = new Movie(3,"飞驰人生3",34.5,"沈腾");
        mov[3] = new Movie(4,"夏洛特烦恼",29.9,"沈腾");
        mov[4] = new Movie(5,"唐顿庄园4",23.5,"维维安");
        mov[5] = new Movie(6,"暗战",23.5,"张家辉");
        MovieOperator mo = new MovieOperator(mov);
        mo.printAll();
        mo.query();
    }
}
