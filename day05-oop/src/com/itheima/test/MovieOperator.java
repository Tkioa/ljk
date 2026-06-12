package com.itheima.test;

import java.util.Scanner;

public class MovieOperator {
    Movie [] mov;
    public MovieOperator(Movie [] mov){
        this.mov = mov;
    }
    //打印电影全部信息
    public void printAll(){
        for(int i=0;i< mov.length;i++){
            Movie movie = mov[i];
            System.out.println(movie.getId()+"\t"+movie.getName()+"\t"+movie.getScore()+"\t"+movie.getDirector());
        }
    }
    //电影ID查询电影名
    public void query(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的ID：");
        int id = sc.nextInt();
        for(int i=0;i< mov.length;i++){
            Movie movie = mov[i];
            if(movie.getId()==id){
                System.out.println(movie.getId()+"\t"+movie.getName()+"\t"+movie.getScore()+"\t"+movie.getDirector());
                break;
            }
        }
    }
}
