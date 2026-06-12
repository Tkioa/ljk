package com.itheima.test;

public class Movie {
    private int id;//电影编号
    private String name;//电影名称
    private double score;//电影价格
    private String director;//电影主演

    public Movie(){}
    public Movie(int id,String name,double score,String director){
        this.id = id;
        this.name = name;
        this.score = score;
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
